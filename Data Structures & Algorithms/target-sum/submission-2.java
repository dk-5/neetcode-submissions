class Solution {
    Map<String,Integer>a;
    public int findTargetSumWays(int[] nums, int target) {
        a=new HashMap<>();
        return dfs(target,0,nums);
    }
    public int dfs(int t,int i,int[]nums)
    {
        String s=i+"-"+t;
        if(a.containsKey(s))
        {
            return a.get(s);
        }
        if(i==nums.length)
        {
            return t==0?1:0;
        }
        int add=dfs(t+nums[i],i+1,nums);
        int sub=dfs(t-nums[i],i+1,nums);
        int res=add+sub;
        a.put(s,res);
        return res;
    }
}

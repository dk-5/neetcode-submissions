class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(target,0,nums);
    }
    public int dfs(int t,int i,int[]nums)
    {
        if(i==nums.length)
        {
            return t==0?1:0;
        }
        
        return dfs(t-nums[i],i+1,nums)+dfs(t+nums[i],i+1,nums);
    }
}

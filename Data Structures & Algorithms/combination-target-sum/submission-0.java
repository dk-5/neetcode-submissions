class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res=new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        sum(nums,target,a,0);
        return res;
    }

    public void sum(int[] nums,int target,List<Integer>a,int i)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(a));
            return;
        }
        if(target<0 || i>=nums.length)
        {
            return;
        }
        a.add(nums[i]);
        sum(nums,target-nums[i],a,i);
        a.remove(a.size()-1);
        sum(nums,target,a,i+1);    

    }
}

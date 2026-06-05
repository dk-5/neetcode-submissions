class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        combination(new ArrayList<>(),nums,0);
        return res;
    }
    public void combination(List<Integer>a,int[] nums,int i)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[i]);
        combination(a,nums,i+1);
        a.remove(a.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1])
        {
            i++;
        }
        combination(a,nums,i+1);
    }
}

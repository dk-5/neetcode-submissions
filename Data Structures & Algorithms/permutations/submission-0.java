class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        getpermute(nums,0);
        return res;
    }
    public void getpermute(int[] nums,int idx)
    {
        if(idx==nums.length)
        {
            List<Integer> a = new ArrayList<>();
            for(int n:nums)
            {
                a.add(n);
            }
            res.add(new ArrayList<>(a));
            return;
        }
        for(int i=idx;i<nums.length;i++)
        {
            swap(nums,idx,i);// did not get
            getpermute(nums,idx+1);
            swap(nums,idx,i);
        }
    }
    public void swap(int []nums,int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}

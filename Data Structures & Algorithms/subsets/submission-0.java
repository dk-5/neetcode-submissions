class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> res=new ArrayList<>();
     List<Integer> a=new ArrayList<>();
     subsets(nums,a,res,0);
     return res;

    }
    public void subsets(int [] nums,List<Integer>a,List<List<Integer>>res,int i)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[i]);
        subsets(nums,a,res,i+1);

        a.remove(a.size()-1);
        subsets(nums,a,res,i+1);
    }
}

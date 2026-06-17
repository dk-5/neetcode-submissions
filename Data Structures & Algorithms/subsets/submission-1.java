class Solution {
    List<List<Integer>> w =new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        combination(new ArrayList<>(),0,nums);
        return w;
    }
    public void combination(List<Integer>a,int i,int[] nums)
    {
        if(i==nums.length)
        {
          w.add(new ArrayList<>(a));
          return;
        }
        a.add(nums[i]);
        combination(a,i+1,nums);
        a.remove(a.size()-1);
        combination(a,i+1,nums);
    }
}

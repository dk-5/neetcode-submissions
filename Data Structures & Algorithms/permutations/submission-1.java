class Solution {
    List<List<Integer>> res=new ArrayList<>(); 
    public List<List<Integer>> permute(int[] nums) {
       permute(new ArrayList<>(),nums,new boolean[nums.length]);
       return res;
    }
    public void permute(List<Integer>a,int[] nums,boolean[] pick)
    {
        if(a.size()==nums.length)
        {
            res.add(new ArrayList<>(a));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
          if(!pick[i])
            {
            a.add(nums[i]);
            pick[i]=true;
            permute(a,nums,pick);
            a.remove(a.size()-1);
            pick[i]=false;
            }
        }
        
    }
}

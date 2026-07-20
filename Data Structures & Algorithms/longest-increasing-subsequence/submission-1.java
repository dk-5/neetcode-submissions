class Solution {
    int[][] a;
   public int lengthOfLIS(int[] nums) {
      a=new int[nums.length][nums.length+1];
      for(int[] r: a)
      {
         Arrays.fill(r,-1);
      }
      return dfs(0,-1,nums);
    }
   public int dfs(int i,int prev,int[] nums)
   {
      if(i>=nums.length)
      {
         return 0;
      }
      if(a[i][prev+1]!=-1)
      {
         return a[i][prev+1];
      }
      int res=dfs(i+1,prev,nums);
      if(prev==-1 || nums[i]>nums[prev])
      {
         res=Math.max(res,1+dfs(i+1,i,nums));
      }
      a[i][prev+1]=res;
      return res;
   }
    
}

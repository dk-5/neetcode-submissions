class Solution {
    // Boolean[] dp;
    public boolean canJump(int[] nums) {
      int goal=nums.length-1;
      for(int i=nums.length-2;i>=0;i--)
      {
        int index=i+nums[i];
        if(index>=goal)
        {
          goal=i;
        }
        
      }
      if(goal==0) return true;
      return false;
    }
    // public boolean dfs(int i,int[] nums)
    // {
    //   if(i==nums.length-1) return true;
    //   if(nums[i]==0) return false;
    //   if(dp[i]!=null) return dp[i];
    //   for(int j=1;j<=nums[i];j++)
    //   {
    //     if(dfs(i+j,nums))
    //     {
    //       dp[i]=true;
    //       return true;
    //     }
    //   }
    //   dp[i]=false;
    //   return false;
    // }
}

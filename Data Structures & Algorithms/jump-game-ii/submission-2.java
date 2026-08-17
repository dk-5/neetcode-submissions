class Solution {
    int[] dp;
    public int jump(int[] nums) {
        int l=0;
        int r=0;
        int jump=0;
    
        while(r<nums.length-1)
        {
            int farthest=0;
            for(int i=l;i<=r;i++)
            {
            farthest=Math.max(farthest,i+nums[i]);    
            }
            l=r+1;
            r=farthest;
            jump++;
        }
        return jump;
        

        // dp=new int[nums.length];
        // Arrays.fill(dp,-1);
        // return dfs(0,nums);
    }
    // public int dfs(int i,int[] nums)
    // {
    //     if(i==nums.length-1) return 0;
    //     if(nums[i]==0) return 10000;
    //     if(dp[i]!=-1) return dp[i];
    //     int min=Integer.MAX_VALUE;
    //     for(int j=1;j<=nums[i];j++)
    //     {
    //      if(j+i<nums.length) min=Math.min(min,1+dfs(i+j,nums));   
         
         
    //     }
    //     return dp[i]=min;

    // }
}

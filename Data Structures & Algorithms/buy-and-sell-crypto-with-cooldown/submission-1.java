class Solution {
    int dp[][];
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2];
        for(int[] r: dp)
        {
            Arrays.fill(r,-1);
        }
        return dfs(0,true,prices);
    }
    public int dfs(int i,boolean buy,int[] prices)
    {
        if(i>=prices.length)
        {
            return 0;
        }
        int z= buy==true?1:0;
        if(dp[i][z]!=-1)
        {
            return dp[i][z];
        }
        
        if(buy)
        {
            int b=dfs(i+1,false,prices)-prices[i];
            int cooldown=dfs(i+1,true,prices);
           dp[i][z]=Math.max(b,cooldown);
        }
        else 
        {
         int s=dfs(i+2,true,prices)+prices[i];
         int cooldown=dfs(i+1,false,prices);
          dp[i][z]=Math.max(s,cooldown);
        }
        return dp[i][z];
    }
}

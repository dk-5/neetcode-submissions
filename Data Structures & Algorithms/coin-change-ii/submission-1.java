class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
     dp=new int[coins.length+1][amount+1]; 
     for(int[] r:dp)
     {
        Arrays.fill(r,-1);
     }  
     Arrays.sort(coins);
     return dfs(0,amount,coins);   
    }
    public int dfs(int i,int a,int[] coins)
    {
        if(a==0)
        {
            return 1;
        }
        if(i>=coins.length)
        {
            return 0;
        }
        if(dp[i][a]!=-1)
        {
            return dp[i][a];
        }
        int res=0;
        if(a>=coins[i])
        {
            res=dfs(i+1,a,coins);
            res+=dfs(i,a-coins[i],coins);
        }
        return dp[i][a]=res;
    }
}

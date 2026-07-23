class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp=new int[word1.length()+1][word2.length()+1];
        for(int[]r:dp)
        {
            Arrays.fill(r,-1);
        }
        return dfs(0,0,word1,word2);
    }
    public int dfs(int i,int j,String s1,String s2)
    {
        if(i==s1.length())
        {
            return s2.length()-j;
        }
        if(j==s2.length())
        {
            return s1.length()-i;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int res=0;
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dfs(i+1,j+1,s1,s2);
        }
        res=Math.min(1+dfs(i,j+1,s1,s2),1+dfs(i+1,j,s1,s2));
        res=Math.min(res,1+dfs(i+1,j+1,s1,s2));
        dp[i][j]=res;
        return res;
    }
}

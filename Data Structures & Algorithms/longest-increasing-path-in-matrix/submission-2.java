class Solution {
    int ROW;
    int COL;
    int[][] d={{-1,0},{1,0},{0,1},{0,-1}};
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
       ROW=matrix.length;
       COL=matrix[0].length;
       dp=new int[ROW][COL];
       int max=1;
       for(int[] r:dp)
       {
        Arrays.fill(r,-1);
       }
       for(int i=0;i<ROW;i++)
       {
        for(int j=0;j<COL;j++)
        {
            max=Math.max(max,dfs(i,j,matrix,-1));
        }
       } 
       return max;
    }
    public int dfs(int r,int c,int[][] matrix,int prev)
    {
        if(r<0 || r>=ROW || c<0 || c>=COL || prev>=matrix[r][c])
        {
            return 0;
        }
        if(dp[r][c]!=-1)
        {
            return dp[r][c];
        }
        int res=1;
        for(int[] w:d)
        {
            res=Math.max(res,1+dfs(r+w[0],c+w[1],matrix,matrix[r][c]));
        }
        dp[r][c]=res;
        return res;

    }
}

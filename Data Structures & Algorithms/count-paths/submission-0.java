class Solution {
    int [][] visited;
    public int uniquePaths(int m, int n) {
        
        visited=new int[m][n];
        
        for(int []r:visited)
        {
            Arrays.fill(r,-1);
        }
        return dfs(0,0,m,n);
    }
    public int dfs(int i,int j,int m,int n)
    {
        if(i==(m-1) && j==(n-1))
        {
            return 1;
        }
        if(i>=m || j>=n)
        {
            return 0;
        }
        
        if(visited[i][j]!=-1)
        {
            return visited[i][j];
        }
        return visited[i][j]=dfs(i+1,j,m,n)+dfs(i,j+1,m,n);
    }
}

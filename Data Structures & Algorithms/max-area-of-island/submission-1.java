class Solution {
    static public int[][] a={{-1,0},{1,0},{0,-1},{0,1}};
    int max_area=0;
    public int maxAreaOfIsland(int[][] grid) {

        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                    max_area=Math.max(max_area,dfs(i,j,grid));
                }
            }
        }
        return max_area;
       
    }
    public int dfs(int r,int c,int[][]grid)
    {
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==0)
        {
            return 0;
        }
        grid[r][c]=0;
        int area=1;
        for(int i=0;i<4;i++)
        {
         area+=dfs(r+a[i][0],c+a[i][1],grid);
        }
        return area;
    }
}

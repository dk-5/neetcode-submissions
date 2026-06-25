
class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
        
    }
    public void dfs(int r,int c,char[][] grid)
    {
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]=='0')
        { 
          return;  
        }
        grid[r][c] = '0';   
        for(int i=0;i<4;i++)
            {
                
                 dfs(r+directions[i][0],c+directions[i][1],grid);
                
            }
    }
}

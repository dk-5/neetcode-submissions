class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        boolean[][] visited= new boolean[row][col];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==0)
                {
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty())
        {
            int[]a=q.poll();
            int r=a[0];
            int c=a[1];
            visited[r][c]=true;
            int[][] dir={{-1,0},{1,0},{0,1},{0,-1}};
            for(int[]w : dir)
            {
                int rw= r + w[0];
                int cw= c + w[1];
                if(rw<0 || rw>=row || cw<0 || cw>=col || visited[rw][cw] || grid[rw][cw]!=Integer.MAX_VALUE)
                {
                    continue;
                }
                q.offer(new int[]{rw,cw});
                grid[rw][cw]=grid[r][c]+1;
                
            }
        }
    }
}

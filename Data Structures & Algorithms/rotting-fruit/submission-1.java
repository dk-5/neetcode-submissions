class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int []>q= new LinkedList<>();
        int row=grid.length;
        int col=grid[0].length;
        int time=0;
        int fresh=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                    fresh++;
                }
                else if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(fresh>0 && !q.isEmpty())
        {
            int l=q.size();
            for(int i=0;i<l;i++)
            {
            int[] a=q.poll();
            int r=a[0];
            int c=a[1];
            int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
            for(int[] w : dir)
            {
                int rw=r+w[0];
                int cw=c+w[1];
                if(rw>=0 && rw<row && cw>=0 && cw<col && grid[rw][cw]==1)
                {
                  fresh--;
                  grid[rw][cw]=2;
                  q.offer(new int[]{rw,cw});
                }
                }

            }
            time++;
            
            
        }
        return fresh==0? time:-1;
    }
}

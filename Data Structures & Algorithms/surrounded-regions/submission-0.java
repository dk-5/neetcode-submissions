class Solution {
    int ROW;
    int COL;
    boolean[][] visited;
    int[][] dir={{-1,0},{0,1},{0,-1},{1,0}};
    public void solve(char[][] board) {
        ROW=board.length;
        COL=board[0].length;
        visited=new boolean[ROW][COL];
        for(int i=0;i<COL;i++)
        {
            dfs(0,i,board);
            dfs(ROW-1,i,board);
        }
        for(int i=0;i<ROW;i++)
        {
            dfs(i,0,board);
            dfs(i,COL-1,board);
        }
        for(int i=0;i<ROW;i++)
        {
            for(int j=0;j<COL;j++)
            {
                if(board[i][j]=='O' && !visited[i][j])
                {
                    board[i][j]='X';
                }
            }
        }

        

    }
    public void dfs(int r,int c,char[][] board)
    {
        if(board[r][c]=='X') return;
        visited[r][c]=true;
        for(int[] w:dir)
        {
            int rw=r+w[0];
            int cw=c+w[1];
            if(rw>=0 && rw<ROW && cw>=0 && cw<COL && !visited[rw][cw] && board[rw][cw]=='O')
            {
                
                dfs(rw,cw,board);
            }
        }
    }
}

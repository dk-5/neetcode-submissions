class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(check(board,word,i,j,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean check(char[][] board,String word,int r,int c,int i)
    {
     if(word.length()==i)
     {
        return true;
     }
     else if(board.length<=r || board[0].length<=c || r<0 || c<0)
     {
        return false;
     }
     else if(board[r][c]!=word.charAt(i) || board[r][c]=='#')
     {
        return false;
     }
     board[r][c]='#';
     boolean ans=check(board,word,r,c-1,i+1)|| check(board,word,r,c+1,i+1) ||
     check(board,word,r+1,c,i+1) ||
     check(board,word,r-1,c,i+1);
     
     board[r][c]=word.charAt(i);
     return ans;
   
    
     
    }
}

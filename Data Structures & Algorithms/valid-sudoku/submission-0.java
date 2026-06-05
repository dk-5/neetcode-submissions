class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean r=checkrow(board);
        boolean c=checkcolumn(board);
        boolean s=checksquare(board);
        System.out.print(r);
        if(r&&c&&s)
        {
            return true;
        }
        return false;
    }
    public boolean checkrow(char[][] board)
    {
     Set<Character> r= new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                 if(r.contains(board[i][j]))
                {
                    return false;
                }
                else
                {
                    r.add(board[i][j]);
                }
                }
                
            }
            r.clear();

        }
        return true;
    }
    public boolean checkcolumn(char[][] board)
    {
        Set<Character> r= new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[j][i]!='.')
                {
                if(r.contains(board[j][i]))
                {
                    return false;
                }
                else
                {
                    r.add(board[j][i]);
                }
                }
                
            }
            r.clear();

        }
        return true;


    }
    public boolean checksquare(char [][] board)
    {
     Set<Character> r= new HashSet<>();
     for(int s=0;s<9;s++)
     {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int row=(s/3)*3+i;
                int col=(s%3)*3+j;
                if(board[row][col]!='.')
                {
                 if(r.contains(board[row][col]))
                {
                    return false;
                }
                else
                {
                    r.add(board[row][col]);
                }
                }
            }
        }
        r.clear();
     }
     return true;

    }
}

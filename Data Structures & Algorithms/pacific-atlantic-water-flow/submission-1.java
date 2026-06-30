class Solution {
    int ROW;
    int COL;
    int [][] dir={{-1,0},{0,1},{1,0},{0,-1}};
    boolean[][]pac;
    boolean[][]atl;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
    List<List<Integer>> res = new ArrayList<>();
    ROW=heights.length;
    COL=heights[0].length;
    pac=new boolean[ROW][COL];
    atl=new boolean[ROW][COL];
    for(int i=0;i<COL;i++)
    {
      dfs(0,i,pac,heights);
      dfs(ROW-1,i,atl,heights);
    }
    for(int i=0;i<ROW;i++)
    {
      dfs(i,0,pac,heights);
      dfs(i,COL-1,atl,heights);
    }
    for(int i=0;i<ROW;i++)
    {
      for(int j=0;j<COL;j++)
      {
         if(pac[i][j] && atl[i][j])
         {
           List<Integer> l1 = new ArrayList<>();
           l1.add(i);
           l1.add(j);
           res.add(l1);
         }
      }
    }
    return res;

        
    }
    void dfs(int r,int c,boolean[][] check,int[][] heights)
   {
      check[r][c]=true;
      for(int[] w:dir)
      {
         int rw=r+w[0];
         int cw=c+w[1];
         if(rw>=0 && rw<ROW && cw>=0 && cw<COL && !check[rw][cw] && heights[rw][cw]>=heights[r][c])
         {
            dfs(rw,cw,check,heights);
         }

      }
   }
}

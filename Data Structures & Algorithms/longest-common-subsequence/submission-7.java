class Solution {
    int[][] visited;
    public int longestCommonSubsequence(String text1, String text2) {
       visited=new int[text1.length()+1][text2.length()+1];
       for(int[] r : visited)
       {
        Arrays.fill(r,-1);
       }
       return dfs(0,0,text1,text2);
    }
    public int dfs(int i,int j,String text1, String text2)
    {
        if(i==text1.length() || j==text2.length())
        {
            return 0;
        }
        if(visited[i][j]!=-1)
        {
            return visited[i][j];
        }
        if(text1.charAt(i)!=text2.charAt(j))
        {
            visited[i][j]=Math.max(dfs(i+1,j,text1,text2),dfs(i,j+1,text1,text2));
        }
        else 
        {
            visited[i][j]=1+dfs(i+1,j+1,text1,text2);
        }
        return visited[i][j];
    }
}

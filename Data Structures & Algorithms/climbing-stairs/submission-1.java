class Solution {
    int[] visited;
    public int climbStairs(int n) {
        visited=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            visited[i]=-1;
        }
        return dfs(n,0);
    }
    public int dfs(int n,int z)
    {
        if(z>=n){
            if(z==n)
            {
                return 1;
            }
            else 
            {
                return 0;
            }
        }
        if(visited[z]!=-1)
        {
            return visited[z];
        }
        return visited[z]=dfs(n,z+1) + dfs(n,z+2); 
    }
}

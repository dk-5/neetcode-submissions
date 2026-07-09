class Solution {
     int[] fin;
    public int minCostClimbingStairs(int[] cost) {
        fin=new int[cost.length];
        Arrays.fill(fin,-1);
      return Math.min(dfs(0,cost),dfs(1,cost));

    }
    public int dfs(int i,int[] cost)
    {
    if(i>=cost.length)
    {
        return 0;
    }
    if(fin[i]!=-1)
    {
        return fin[i];
    }
    return fin[i]=cost[i]+Math.min(dfs(i+1,cost),dfs(i+2,cost));
    }
}

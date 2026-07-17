class Solution {
    Map<Integer,Integer> a = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
       int a = dfs(amount,coins);
       return a==Integer.MAX_VALUE? -1:a;
    }
    public int dfs(int amount,int[] coins)
    {
        if(amount==0) return 0;
        if(a.containsKey(amount))
        {
            return a.get(amount);
        }
        int res=Integer.MAX_VALUE;
        for(int c:coins)
        {
            if((amount-c)>=0)
            {
                int result=dfs(amount-c,coins);
                if(result!=Integer.MAX_VALUE)
                {
                    res=Math.min(res,1+result);
                }
            }
        }
        a.put(amount,res);
        return res;
    }
}

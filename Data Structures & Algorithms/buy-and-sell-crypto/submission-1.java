class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxP=0;
        for(int i=1;i<prices.length;i++)
        {
            if(buy<prices[i])
            {
                int p=prices[i]-buy;
                maxP=Math.max(p,maxP);
            }
            else 
            {
                buy=prices[i];
            }

        }
        if(maxP>0)
        {
            return maxP;
        }
        return 0;
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gas_sum=0;
        int cost_sum=0;
        for(int i=0;i<gas.length;i++)
        {
            gas_sum+=gas[i];
            cost_sum+=cost[i];
        }
        if(gas_sum<cost_sum) return -1;
        int total=0;
        int index=0;
        for(int i=0;i<gas.length;i++)
        {
            total+=gas[i]-cost[i];
            if(total<0)
            {
                total=0;
                index=i+1;
            }
        }
        return index;
    }
}
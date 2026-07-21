class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum%2!=0)
        {
            return false;
        }
        int t=sum/2;
        dp= new Boolean[nums.length][t+1];
        return dfs(0,t,nums);


}
public boolean dfs(int i,int t,int[] nums)
{
if(t==0)
{
    return true;
}
if(i>=nums.length || t<0)
{
    return false;
}
if(dp[i][t]!=null)
{
    return dp[i][t];
}
return dp[i][t]=dfs(i+1,t,nums) || dfs(i+1,t-nums[i],nums);
}
}

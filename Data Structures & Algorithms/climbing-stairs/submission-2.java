class Solution {
    int[] visited;
    public int climbStairs(int n) {
        int prev=1;
        int prev2=1;
        for(int i=0;i<n-1;i++)
        {
            int temp=prev;
            prev=prev+prev2;
            prev2=temp;
        }
        return prev;
    }
}
  
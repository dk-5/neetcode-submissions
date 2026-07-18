class Solution {
    int max=0;
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int curMin=1;
        int curMax=1;

        for(int i:nums)
        {
        //  if(i==0) 
        //  {
        //  curMin=1;
        //  curMax=1; 
        //  continue;
        //  }     
         int temp=i*curMax;
         curMax=Math.max(Math.max(i*curMax,i*curMin),i);
         curMin=Math.min(Math.min(temp,i*curMin),i);
         res=Math.max(res,curMax);
        }
        return res;
    }
  
}

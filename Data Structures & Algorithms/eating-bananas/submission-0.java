class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=0,r;
        int max=0;
        int k=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>max)
            {
                max=piles[i];
            }
        }
        r=max;
        while(l<=r)
        {
            long t=0;
            int mid=(l+r)/2;
            for(int i=0;i<piles.length;i++)
            {
             t+=Math.ceil((double)piles[i]/mid);
            }
            if(t<=h)
            {
                k=mid;
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return k;
    }
}

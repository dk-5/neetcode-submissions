class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length+nums2.length;
        int check=length%2;
        int pos;
        if(check==1) {
        pos=(length+1)/2;
        int z= median(nums1,nums2,pos);
        return (double) z;
        }
        else 
        {
         pos=length/2;
         int x=median(nums1,nums2,pos);
         int y=median(nums1,nums2,pos+1);
         return (double)(x+y)/2;
        } 

    }
    public int median(int[] nums1,int[] nums2,int pos)
    {
        int l=0;
        int r=0;
        int s=0;
        while(l<nums1.length && r<nums2.length)
        {
            if(nums1[l]<nums2[r])
            {
                
                s++;
                if(s==pos)
                {
                    return nums1[l];
                }
                l++;
            }
            else 
            {
                
                s++;
                if(s==pos)
                {
                    return nums2[r];
                }
                r++;
            }
        }
        while(l<nums1.length)
        {
            s++;
                if(s==pos)
                {
                    return nums1[l];
                }
                l++;

        }
        while(r<nums2.length)
        {
            s++;
                if(s==pos)
                {
                    return nums2[r];
                }
                r++;
        }
        return 0;
    }

}

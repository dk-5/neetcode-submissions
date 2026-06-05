class Solution {
    public int maxArea(int[] heights) {
       int max=0;
       int left=0;
       int right=heights.length-1;
       while(left<right)
       {
        int base=right-left;
        int height;
        if(heights[left]>heights[right])
        {
         height=heights[right];
         right--;
        }
        else 
        {
            height=heights[left];
            left++;
        }
        int product=base*height;
        if(product>max)
        {
            max=product;
        }

       } 
       return max;
    }
    
}

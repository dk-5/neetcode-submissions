class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int h=matrix[0].length-1;// column counts 
        int r=matrix.length;// row countt
     for(int i=0;i<r;i++)
     {
        if(matrix[i][l]<=target && matrix[i][h]>=target)
        {
            while(l<=h)
            {
                int mid=(l+h)/2;
                if(matrix[i][mid]==target)
                {
                    return true;
                }
                else if(matrix[i][mid]>target)
                {
                    h=mid-1;
                }
                else 
                {
                    l=mid+1;
                }
            }
        }
     }
     return false;   
    }
}

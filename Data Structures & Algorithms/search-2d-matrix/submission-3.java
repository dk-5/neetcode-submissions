class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int r=matrix.length;
    int c=matrix[0].length;
    int top=r-1;
    int bot=0;
    while(bot<=top)
    {
      int mid=(bot+top)/2;
      if(target>matrix[mid][c-1])
      {
        bot=mid+1;
      }
      else if(target<matrix[mid][0])
      {
        top=mid-1;
      }
      else 
      {
        break;
      }
    }
    int row=(bot+top)/2;
    int l=0;
    int h=c-1;
    
    while(l<=h)
    {
        int mid=(l+h)/2;
        if(target>matrix[row][mid])
        {
            l=mid+1;
        }
        else if(target<matrix[row][mid])
        {
            h=mid-1;
        }
        else 
        {
            return true;
        }
    }
    return false;

    }
}

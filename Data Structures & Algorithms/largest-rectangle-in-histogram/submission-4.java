class Solution {
    public int largestRectangleArea(int[] heights) {
     int nse=-1;
     int pse;
     int maxarea=0;
     Stack<Integer> a = new Stack<>();
     a.push(0);
     for(int i=1;i<heights.length;i++)
     {
     while(!a.isEmpty() && heights[a.peek()]>heights[i])
     {
      nse=i;
      int h=heights[a.pop()];
      if(a.isEmpty()) {pse=-1;}
      else {pse=a.peek();}
      maxarea=Math.max(h*(nse-pse-1),maxarea);

     }
     a.push(i);
     }
     while(!a.isEmpty())
     {
      nse=heights.length;
      int e=heights[a.pop()];
      if(a.isEmpty()) {pse=-1;}
      else {pse=a.peek();}
      maxarea=Math.max(e*(nse-pse-1),maxarea);
     }
     return maxarea;   
}
}
class Solution {
    public int largestRectangleArea(int[] heights) {
      Stack<int[]> w= new Stack<>();
      int maxArea=0;
      for(int i=0;i<heights.length;i++)
      {
        int area=0;
        int start=i;
        while(!w.isEmpty() && w.peek()[1]>heights[i])
        {
          int[] top=w.pop();
           int index=top[0];
           int height=top[1];
           area=height*(i-index);
           maxArea=Math.max(maxArea,area);
           start=index;
        }
        w.push(new int[]{start,heights[i]});
      }
      while(!w.isEmpty())
      {
        int[] top=w.pop();
        int index=top[0];
        int height=top[1];
       int area=height*(heights.length-index);
       maxArea=Math.max(maxArea,area);
      }  
      return maxArea;
    }
}

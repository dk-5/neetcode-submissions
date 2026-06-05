class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     Stack<int[]> a= new Stack<>();
     int res[]=new int[temperatures.length];
     for(int i=0;i<temperatures.length;i++) 
     {
      while(!a.isEmpty() && a.peek()[0]<temperatures[i])
      {
       res[a.peek()[1]]=i-a.peek()[1];
       a.pop();

      }
      a.push(new int[]{temperatures[i],i});
     }
     while(!a.isEmpty())
     {
        res[a.peek()[1]]=0;
        a.pop();
     } 
     return res;
    }
}

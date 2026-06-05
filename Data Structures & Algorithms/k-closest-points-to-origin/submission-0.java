class Solution {
    public int[][] kClosest(int[][] points, int k) {
      PriorityQueue<int[]> d= new PriorityQueue<>((a,b)->Integer.compare(b[0]*b[0]+b[1]*b[1],a[0]*a[0]+a[1]*a[1]));  
     for(int[] point:points)
     {
        d.offer(point);
        if(d.size()>k) d.poll();
     } 
      int [][] res=new int[k][2];
      int i=0;
      while(!d.isEmpty())
      {
       res[i++]=d.poll(); 
      }
      return res;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
     
     int[][] z=new int[position.length][2];
     for(int i=0;i<position.length;i++)
     {
      z[i][0]=position[i];
      z[i][1]=speed[i];
     }
     Arrays.sort(z,(a,b)->Integer.compare(b[0],a[0]));
     Stack<Double> a = new Stack<>();
     for(int i=0;i<position.length;i++)
     {
        double t =(double) (target-z[i][0])/z[i][1];
        if(a.isEmpty())
        {
            a.push(t);
        }
        else
        {
            if(a.peek()<t)
            {
             a.push(t); 
            }
        }
     }
     return a.size();
    }
}

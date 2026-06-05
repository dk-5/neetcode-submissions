class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer> s = new PriorityQueue<Integer>(Comparator.reverseOrder());
      for(int w:stones)
      {
       s.offer(w);
      }
      while(s.size()!=1)
      {
        int x=s.poll();
        int y=s.poll();
        if(x>y)
        {
            x=x-y;
            s.offer(x);
        }
        else 
        {
            y=y-x;
            s.offer(y);
        }

      }
      return s.poll();  
    }
}

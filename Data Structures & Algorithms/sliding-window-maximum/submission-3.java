class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      int res[]=new int[nums.length-k+1];
      int j=0;
      PriorityQueue<int[]>w=new PriorityQueue<>((a,b)->b[0]-a[0]);
      for(int i=0;i<nums.length;i++)
      {
       w.offer(new int[]{nums[i],i});
      if(i>=(k-1))
       {
        while(w.peek()[1]<=(i-k))
       {
        w.poll();
       }
        res[j]=w.peek()[0];
        j++;
       }
       
       
       
      }
      return res;

    }
}

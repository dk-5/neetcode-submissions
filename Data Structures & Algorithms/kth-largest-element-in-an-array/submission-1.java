class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> a = new PriorityQueue<>();  
      for(int num:nums)
      {
        a.offer(num);
        if(a.size()>k)
        {
          a.poll();
        }
      }
      return a.peek();
      
    }


}

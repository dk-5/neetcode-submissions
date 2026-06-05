class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> a = new PriorityQueue<>(Collections.reverseOrder());  
      for(int num:nums)
      {
        a.offer(num);
      }
      while(k!=1)
      {
        a.poll();
        k--;
      } 
      return a.poll();
      
    }


}

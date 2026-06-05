class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> h1= new HashMap<>();
      for(int i=0; i< nums.length;i++)
      {
        h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
      }
      PriorityQueue<int[]> p= new PriorityQueue<>((a,b)-> a[0]-b[0]);
      for(Map.Entry<Integer,Integer> entry: h1.entrySet())
      {
        p.offer(new int[]{entry.getValue(),entry.getKey()});
        if(p.size()>k)
        {
            p.poll();
        }
      }
      int [] res =new int[k];
      for(int i=0;i<k;i++)
      {
        res[i]=p.poll()[1];
      }
      return res;
        
    }
}

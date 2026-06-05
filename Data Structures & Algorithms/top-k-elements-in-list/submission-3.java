class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> x=new HashMap<>();
       for(int n:nums)
       {
        x.put(n,x.getOrDefault(n,0)+1);
       }
       PriorityQueue<int[]> z = new PriorityQueue<>((a,b)->a[0]-b[0]);
       for(Map.Entry<Integer,Integer>w:x.entrySet())
       {
        z.offer(new int[]{w.getValue(),w.getKey()});
        if(z.size()>k)
        {
            z.poll();
        }
       }
       int res[]=new int[k];
       for(int i=0;i<k;i++)
       {
        res[i]=z.poll()[1];
       } 
       return res;
    }
}

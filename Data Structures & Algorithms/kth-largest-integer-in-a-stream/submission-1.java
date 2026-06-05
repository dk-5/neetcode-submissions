class KthLargest {
    PriorityQueue<Integer> a;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.a=new PriorityQueue<>(); 
        for(int num:nums)
        {
            a.offer(num);
            if(a.size()>k)
            {
                a.poll();
            }
        }
    }
    
    public int add(int val) {
       a.offer(val);
       if(a.size()>k)
       {
        a.poll();
       } 
       return a.peek();
    }
}

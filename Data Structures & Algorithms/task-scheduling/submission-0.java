class Solution {
    public int leastInterval(char[] tasks, int n) {
        int time=0;
        int count[]=new int[26];
        for(char c:tasks)
        {
            count[c-'A']++;
        }
        PriorityQueue<Integer> b=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
            {
                b.offer(count[i]);
            }
        }
        Queue<int[]> w=new LinkedList<>();
        
        while(!b.isEmpty() || !w.isEmpty())
        {
            time++;
            if (!b.isEmpty()) {
                int cnt = b.poll();
                cnt--;

                if (cnt > 0) {
                    w.add(new int[]{cnt, time + n});
                }
            }
         
         if (!w.isEmpty() && w.peek()[1] == time) {
                b.offer(w.poll()[0]);
            }



        }
    return time;
    }

}


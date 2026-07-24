class Solution {
    Set<Integer> visited = new HashSet<>();
    Map<Integer,List<int[]>> adj=new HashMap<>();
    public int networkDelayTime(int[][] times, int n, int k) {
        for(int[]r: times)
        {
            if(!adj.containsKey(r[0]))
            {
                adj.put(r[0],new ArrayList<>());
            }
            adj.get(r[0]).add(new int[]{r[1],r[2]});
        }
        PriorityQueue<int[]> q= new PriorityQueue<>((a,b)->a[0]-b[0]);
        q.offer(new int[]{0,k});
        int t=0;
        while(!q.isEmpty())
        {
         int[] cur=q.poll();
         
         int node=cur[1];
         if(visited.contains(node))continue;
         t=cur[0];
         visited.add(node);
            if(adj.containsKey(node))
            {
             for(int[] w:adj.get(node))
            {
                if(!visited.contains(w[0]))
                {
                 q.offer(new int[]{t+w[1],w[0]});
                }
                
            }
            }
            
         }
          return visited.size()==n?t:-1;
        }
       
    }
    


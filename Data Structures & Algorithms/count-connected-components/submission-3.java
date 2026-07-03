class Solution {
    Map<Integer,List<Integer>> a = new HashMap<>();
    Set<Integer> visit= new HashSet<>();
    int z=0;
    public int countComponents(int n, int[][] edges) {
       for(int i=0;i<n;i++)
       {
        a.put(i,new ArrayList<>());
       }
       for(int i=0;i<edges.length;i++)
       {
         a.get(edges[i][0]).add(edges[i][1]);
         a.get(edges[i][1]).add(edges[i][0]);
        }
       for(int i=0;i<n;i++)
       {
        if(!visit.contains(i))
        {
            z+=1;
         dfs(i);
         
        }
       }
       return z;

    }
    public void dfs(int i)
    {
        if(!visit.contains(i))
        {
            visit.add(i);
            for(int w: a.get(i))
            {
                dfs(w);
            }
        }
    }
}

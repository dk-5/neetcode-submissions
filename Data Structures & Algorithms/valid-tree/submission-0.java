class Solution {
    Map<Integer,List<Integer>> a = new HashMap<>();
    Set<Integer> visited= new HashSet<>();
    public boolean validTree(int n, int[][] edges) {
         for(int i=0;i<n;i++)
         {
          a.put(i,new ArrayList<>());  
         }
         for(int[] i:edges )
         {
            a.get(i[0]).add(i[1]);
            a.get(i[1]).add(i[0]);
         }
         
          if(!dfs(0,-1))
            {
                return false;
            }
            return visited.size()==n;
         }
         
    
    public boolean dfs(int i,int prev)
    {
        if(visited.contains(i))
        {
            return false;
        }
        visited.add(i);
        for(int w:a.get(i))
        {
            if(w==prev) continue;
            if(!dfs(w,i))
            {
                return false;
            }
        }
        return true;
    }
}

class Solution {
    Map<Integer,List<Integer>> a= new HashMap<>();
    Set<Integer> visited = new HashSet<>(); 
    public int[] findRedundantConnection(int[][] edges) {
        int[] res= new int[2];

        for(int i=1;i<=edges.length;i++)
        {
         a.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            a.get(edges[i][0]).add(edges[i][1]);
            a.get(edges[i][1]).add(edges[i][0]);
        }
        for(int i=edges.length-1;i>=0;i--)
        {
            visited.clear();
            a.get(edges[i][0]).remove(Integer.valueOf(edges[i][1]));
            a.get(edges[i][1]).remove(Integer.valueOf(edges[i][0]));

            if(dfs(edges[i][0],edges[i][1]))
            {
             res[0]=edges[i][0];
             res[1]=edges[i][1];
             break;
            }
            a.get(edges[i][0]).add(edges[i][1]);
            a.get(edges[i][1]).add(edges[i][0]);
        }
        return res;
    }
    public boolean dfs(int e1,int e2)
    {
        if(e1==e2)
        {
            return true;
        }
        else if(visited.contains(e1))
        {
            return false;
        }
        visited.add(e1);
        for(int w:a.get(e1))
        {
             if(dfs(w,e2)){
                return true;
             } 
        
        }
        return false;
    }
}

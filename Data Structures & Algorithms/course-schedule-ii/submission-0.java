class Solution {
    Map<Integer,List<Integer>> a = new HashMap<>();
    Set<Integer> visit = new HashSet<>();
    Set<Integer> cycle= new HashSet<>();
    List<Integer> res= new ArrayList<>();
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    
        for(int i=0;i<numCourses;i++)
        {
            a.put(i,new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            a.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for(int i=0;i<numCourses;i++)
        {
            if(!dfs(i))
            {
                return new int[0];
            }
        }
        int[] a = new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
         a[i]=res.get(i);
        }
        return a;
        
    }
    public boolean dfs(int c)
    {
        if(cycle.contains(c))
        {
            return false;
        }
        if(visit.contains(c))
        {
            return true;
        }
        cycle.add(c);
        for(int w: a.get(c))
        {
            if(!dfs(w))
            {
                return false;
            }
        }
        cycle.remove(c);
        visit.add(c);
        res.add(c);
        return true;


    }
}

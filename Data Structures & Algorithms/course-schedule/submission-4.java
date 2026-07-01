class Solution {
    Map<Integer,List<Integer>> map= new HashMap<>();
    Set<Integer> visit = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    for(int i=0;i<numCourses;i++)
    {
        map.put(i,new ArrayList<>());
    }
    for(int i=0;i<prerequisites.length;i++)
    {
        map.get(prerequisites[i][0]).add(prerequisites[i][1]);
    }
    for(int i=0;i<numCourses;i++)
    {
        if(!dfs(i))
        {
            return false;
        }
    }
    return true;    
       
}

public boolean dfs(int c){
    if(visit.contains(c))
    {
        return false;
    }
    if(map.get(c).isEmpty())
    {
        return true;
    }
    visit.add(c);
    for(int w : map.get(c))
    {
        if(!dfs(w))
        {
            return false;
        }
    }
    visit.remove(c);
    map.put(c,new ArrayList<>());
    return true;
}

   
}

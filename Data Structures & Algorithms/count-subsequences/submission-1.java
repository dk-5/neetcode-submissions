class Solution {
    Map<String,Integer> map;
    public int numDistinct(String s, String t) {
        map= new HashMap<>();
        return dfs(0,s,t,"");
    }
    public int dfs(int i,String s,String t,String z)
    {
        String k=i+z;
        if(map.containsKey(k))
        {
            return map.get(k);
        }
        if(z.length()==t.length() && z.equals(t))
        {
           return 1; 
        }
        if(i>=s.length())
        {
            return 0;
        }
        if(t.length()<z.length())
        {
            return 0;
        }
        
        String res=z+s.charAt(i);
        int l= dfs(i+1,s,t,res)+dfs(i+1,s,t,z);
        map.put(k,l);
        return l;
    }
}

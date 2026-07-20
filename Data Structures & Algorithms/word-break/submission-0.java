class Solution {
    Map<Integer,Boolean> a = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        a.put(s.length(),true);
        return dfs(0,s,wordDict);
    
    }
    public boolean dfs(int i,String s,List<String> wordDict)
    {
        if(a.containsKey(i))
        {
            return a.get(i);
        }
        for(String w:wordDict)
        {
            if(i+w.length()<=s.length() && s.substring(i,i+w.length()).equals(w))
            {
                if(dfs(i+w.length(),s,wordDict))
                {
                a.put(i,true);
                return true;
                }
                
            }
        }
        a.put(i,false);
        return false;
    }
}

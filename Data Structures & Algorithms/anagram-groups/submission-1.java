class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> a = new HashMap<>();
        
        for(String s:strs)
        {
            int count[]=new int[26];
            for(char c:s.toCharArray())
            {
             count[c-'a']++;
            }
            String z=Arrays.toString(count);
            a.putIfAbsent(z,new ArrayList<>());
            a.get(z).add(s);
            
        }
        return new ArrayList<>(a.values()); 
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> s1= new HashMap<>();
        for(String str: strs)
        {
            char[] charArray= str.toCharArray();
            Arrays.sort(charArray);
            String sorteds= new String(charArray);
            s1.putIfAbsent(sorteds, new ArrayList<>());
            s1.get(sorteds).add(str);
        }
        return new ArrayList<>(s1.values());

    }
}

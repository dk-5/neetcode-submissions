class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int max=0;
        HashSet<Character> a=new HashSet<>(); 
        for(int r=0;r<s.length();r++)
        {
            while(a.contains(s.charAt(r)))
            {
             a.remove(s.charAt(i));
             i++;
            }
            a.add(s.charAt(r));
            max=Math.max(max,r-i+1);
        }
        return max;
        }
}

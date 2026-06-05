class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int max=0;
        HashSet<Character> a=new HashSet<>(); 
        for(int r=0;r<s.length();r++)
        {
            while(a.contains(s.charAt(r)))
            {
             a.remove(s.charAt(l));
             l++;
            }
            if(s.charAt(l)==s.charAt(r))
            {
                l=r;
            }
            a.add(s.charAt(r));
            max=Math.max(max,r-l+1);
        }
        return max;
        }
}

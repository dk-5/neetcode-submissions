class Solution {
    public int characterReplacement(String s, int k) {
       Map<Character,Integer> a= new HashMap<>();
       int left=0;
       int maxf=0;
       int res=0;
       int right=0;
       while(right<s.length())
       {
        
        a.put(s.charAt(right),a.getOrDefault(s.charAt(right),0)+1);
        maxf=Math.max(maxf,a.get(s.charAt(right)));
        while((right-left+1)-maxf>k)
        {
            a.put(s.charAt(left),a.get(s.charAt(left))-1);
            left++;
        }
        res=Math.max(res,right-left+1);
        right++;
       } 
      return res; 
    }

}

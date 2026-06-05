class Solution {
    public String minWindow(String s, String t) {
      int count1[]= new int[128];
      int count2[]= new int[128];
      int l=0;
      int r=t.length()-1;
      int min=Integer.MAX_VALUE;
      String x="";
      if(t.length()>s.length()) return x;
      for(int i=0;i<t.length();i++)
      {
        count2[t.charAt(i)]++;
        count1[s.charAt(i)]++;

      }
      if(matches(count1,count2))
      {
        
        if(min>(r-l+1))
        {
         min=(r-l+1);
         x=s.substring(l,r+1);
        }
        l++;
        r++;
      }
      r++;
      while(r<s.length())
      {
      count1[s.charAt(r)]++;
      while(matches(count1,count2))
      {
        if(min>(r-l+1))
        {
         min=(r-l+1);
         x=s.substring(l,r+1);
        }
       count1[s.charAt(l)]--;
       l++; 
      }
      r++;

      }
      return x; 

    }
   public boolean matches(int[] a, int[] b) {
    for (int i = 0; i < 128; i++) {
        if (a[i] < b[i]) {
            return false;
        }
    }
    return true;
}
}


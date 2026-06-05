class Solution {
    public boolean checkInclusion(String s1, String s2) {
     int l=0;
     int r= s1.length();
     while(r<=s2.length())
     {
        char [] s2Array=s2.substring(l,r).toCharArray();
        Arrays.sort(s2Array);
        String s3 = new String(s2Array);
        char [] s1Array=s1.toCharArray();
        Arrays.sort(s1Array);
        String s4=new String(s1Array);
        if(s4.equals(s3))
        {
            return true;
        }
        else 
        {
            l++;
            r++;
        }
        


     }
     return false;
    }
}

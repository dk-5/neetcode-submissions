class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        
       return dfs(0,0,0,s1,s2,s3);


    }
    public boolean dfs(int i,int j,int z,String s1,String s2,String s3)
    {
        if(s1.length()+s2.length()!=s3.length()) return false;
        if((i+j)==s3.length()) return true;
        if(i<s1.length() && s1.charAt(i)==s3.charAt(z) && j<s2.length() && s2.charAt(j)==s3.charAt(z))
        {
            return dfs(i+1,j,z+1,s1,s2,s3) || dfs(i,j+1,z+1,s1,s2,s3);
        }
        if(i<s1.length() && s1.charAt(i)==s3.charAt(z))
        {
           return dfs(i+1,j,z+1,s1,s2,s3);
        }
        if(j<s2.length() && s2.charAt(j)==s3.charAt(z))
        {
         return dfs(i,j+1,z+1,s1,s2,s3);   
        }
        return false;
    }
}

class Solution {
    public Boolean[][]a ;
    public boolean isInterleave(String s1, String s2, String s3) {
       if(s1.length()+s2.length()!=s3.length()) return false; 
       a = new Boolean[s1.length()+1][s2.length()+1];
       return dfs(0,0,0,s1,s2,s3);


    }
    public boolean dfs(int i,int j,int z,String s1,String s2,String s3)
    {
        
        if(z==s3.length()){
            return (i==s1.length()) &&(j==s2.length());}
        if(a[i][j]!=null)
        {
            return a[i][j];
        }    
        boolean res=false;
        if(i<s1.length() && s1.charAt(i)==s3.charAt(z))
        {
          res=dfs(i+1,j,z+1,s1,s2,s3);
        }
        if(!res && j<s2.length() && s2.charAt(j)==s3.charAt(z))
        {
         res=dfs(i,j+1,z+1,s1,s2,s3);   
        }
        a[i][j]=res;
        return a[i][j];
    }
}

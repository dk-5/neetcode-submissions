class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> p=new ArrayList<>();
        backtrack(0,s,res,p);
        return res;
    }
    public void backtrack(int i,String s,List<List<String>> res,List<String>p)
    {
        if(i>=s.length())
        {
            res.add(new ArrayList<>(p));
            return;
        }
        for(int j=i;j<s.length();j++)
        {
            if(isPali(s,i,j))
            {
                p.add(s.substring(i,j+1));
                backtrack(j+1,s,res,p);
                p.remove(p.size()-1);

            }
           

        }
    }
    public boolean isPali(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

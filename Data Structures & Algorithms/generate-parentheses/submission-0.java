class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res= new ArrayList<>();
        solve(0,0,n,new Stack<>());
        return res;
    }

    public void solve(int open,int close,int n,Stack<Character> a)
    {
        if(open==close && open==n)
        {
         StringBuilder w = new StringBuilder();
        for(char c:a)
        {
            w.append(c);
        }
         
         res.add(w.toString());
         return;
        }
        if(open<n)
        {
          a.push('(');
          solve(open+1,close,n,a);
          a.pop();
        }
         if(close<open)
         {
            a.push(')');
            solve(open,close+1,n,a);
            a.pop();
         }
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> x= new Stack<>();
        Map<Character,Character> y= new HashMap<>();
        y.put(')','(');
        y.put('}','{');
        y.put(']','[');

        for(int i=0;i<s.length();i++)
        {
            if(y.containsKey(s.charAt(i)))
            {
                if(!x.empty() && x.peek()==y.get(s.charAt(i)))
                {
                    x.pop();
                }
                else 
                {
                    return false;
                }
            }
            else 
            {
                x.push(s.charAt(i));
            }
        }
        return x.isEmpty();
    }
}

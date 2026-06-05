class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> x= new Stack<>();
        for(String s:tokens)
        {
            int op1,op2;
            switch(s)
            {
                case "+":op1=x.pop();
                         op2=x.pop();
                         x.push((op1+op2));
                         break;
                case "-":op1=x.pop();
                         op2=x.pop();
                         x.push((op2-op1)); 
                         break;
                case "*":op1=x.pop();
                         op2=x.pop();
                         x.push((op1*op2));
                         break; 
                case "/":op1=x.pop();
                         op2=x.pop();
                         x.push((op2/op1));
                         break;
                default:
                x.push(Integer.parseInt(s));                                       

            }

        }
        return x.peek(); 
        
    }
}

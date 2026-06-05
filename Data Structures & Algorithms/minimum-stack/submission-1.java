class MinStack {
     Stack<Integer> a;
    public MinStack() {
        a=new Stack<>();
    }
    
    public void push(int val) {
        a.push(val);
    }
    
    public void pop() {
       a.pop();
    }
    
    public int top() {
        return a.peek();
    }
    
    public int getMin() {
        Stack<Integer> m=new Stack<>();
        int min=a.peek();
        while(!a.isEmpty())
        {

         min=Math.min(min,a.peek());
         m.push(a.pop());
        }
        while(!m.isEmpty())
        {
            a.push(m.pop());
        }
        return min;
    }
}

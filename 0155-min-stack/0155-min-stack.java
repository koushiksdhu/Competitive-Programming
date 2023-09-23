class MinStack {

    Stack<Integer> stk;
    Stack<Integer> min;

    public MinStack() {
        stk = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(min.isEmpty())
            min.push(val);
        else if(min.peek() >= val)
            min.push(val);
    }
    
    public void pop() {
        int pop = stk.pop();
        if(min.peek() == pop)
            min.pop();
    }
    
    public int top() {
        return !stk.isEmpty() ? stk.peek() : 0;
    }
    
    public int getMin() {
        return !min.isEmpty() ? min.peek() : 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
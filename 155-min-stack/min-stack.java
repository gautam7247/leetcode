class MinStack {
    Stack<Long> st=new Stack<>();
    long min=-1;
    public MinStack() {
     //construtor   
    }
    
    public void push(int value) {
        long val=(long)value;
        if(st.size()==0){
            st.push(val);
            min=val;
        }
        else if(val>=min){
            st.push(val);
        }
        else if(val<min){
            st.push(2*val-min);
            min=val;
        }
    }
    
    public void pop() {
        if(st.size()==0) return;
        else if(st.peek()>=min) st.pop();
        else if(st.peek()<min){
            long old=2*min-st.peek();
            min=old;
            st.pop();
        }
    }
    
    public int top() {
        if(st.size()==0) return -1;
        long q=st.peek();
        if(q>=min) return (int)q;
        if(q<=min) return (int)min;
        return 0;
            }
    
    public int getMin() {
        if(st.size()==0) return -1;
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
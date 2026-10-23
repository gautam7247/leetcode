class StockSpanner {
    Stack<Integer>st;
    int[] arr;
    int n;
    public StockSpanner() {
        st=new Stack<>();
        arr=new int[10000];
        n=0;
    }
    
    public int next(int price) {
        arr[n]=price;
        while(st.size()>0 && arr[st.peek()]<=price){
            st.pop();
        }
        int res;
        if(st.size()==0){
            res=n+1;
        }
        else{
            res=n-st.peek();
        }
        st.push(n);
        n++;
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
import java.util.Stack;

class StockSpanner {

    // stack me {price, span} store karenge
    Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        // Jab tak previous price current price se chhota
        // ya equal hai, uska span add kar do
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }

        // Current price aur uska total span store karo
        st.push(new int[]{price, span});

        return span;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
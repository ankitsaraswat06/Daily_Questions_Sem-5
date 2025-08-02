// Last updated: 02/08/2025, 18:55:25
class StockSpanner {
    Stack<int[]> st;

    public StockSpanner() {
       st = new Stack<>();
    }
    
    public int next(int price) {
        int cnt = 1;
        while(!st.isEmpty() && price>=st.peek()[0]) {
            cnt += st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price, cnt});
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
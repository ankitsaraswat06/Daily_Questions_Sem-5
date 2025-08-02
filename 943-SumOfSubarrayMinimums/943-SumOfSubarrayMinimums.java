// Last updated: 02/08/2025, 18:55:21
class Solution {

    public int[] prevSmallerOrEqual(int[] arr) {
        int[] p = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()]>arr[i]) st.pop();
            p[i] = st.isEmpty()? -1 : st.peek();
            st.push(i); 
        }
        return p;
    }

    public int[] nextSmaller(int[] arr) {
        int[] n = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            n[i] = st.isEmpty()? arr.length : st.peek();
            st.push(i); 
        }
        return n;
    }
    public int sumSubarrayMins(int[] arr) {
        int[] nse = nextSmaller(arr);
        int[] pse = prevSmallerOrEqual(arr);
        long total = 0;
        long mod = (long) 1000000007;

        for(int i=0; i<arr.length; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (total + ((long)left * right % mod * arr[i] % mod)) % mod;

        }
        return (int) total;
        
    }
}
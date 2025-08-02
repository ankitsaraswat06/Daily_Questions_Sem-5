// Last updated: 02/08/2025, 18:53:04
class Solution {
    public String smallestNumber(String str) {
        int[] ans = new int[str.length() + 1];
        int count = 1;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<=str.length(); i++) {
            if(i==str.length() || str.charAt(i) == 'I') {
                ans[i] = count;
                count++;
                while(!st.isEmpty()) {
                    ans[st.pop()] = count;
                    count++;
                }

            } else {
                st.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ans.length; i++) {
            sb.append(ans[i]);
        }
        return sb.toString();
        
    }
}
// Last updated: 02/08/2025, 18:57:42
class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int number = 0;
        int result = 0;
        int sign = 1;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                number = number * 10 + (s.charAt(i)-'0');
            } else if(s.charAt(i)=='+') {
                result = result + number * sign;
                number = 0;
                sign = 1;
            } else if(s.charAt(i)=='-') {
                result = result + number * sign;
                number = 0;
                sign = -1;
            } else if(s.charAt(i)=='(') {
                st.push(result);
                st.push(sign);
                result = 0;
                number = 0;
                sign = 1;

            } else if(s.charAt(i)==')') {
                result = result + number * sign;
                number = 0;
                int st_sign = st.pop();
                int st_result = st.pop();
                result = result * st_sign;
                result += st_result;   
            }
        }
        result = result+number*sign;
        return result;
    }
}
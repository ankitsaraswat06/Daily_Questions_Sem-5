// Last updated: 02/08/2025, 19:00:02
class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;
        boolean isPositive = true;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            isPositive = false;
            i++;
        }
        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (isPositive && result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (!isPositive && -result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }

        return isPositive ? (int) result : (int) -result;
    }
}

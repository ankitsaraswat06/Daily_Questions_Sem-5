// Last updated: 02/08/2025, 18:59:38
class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: if dividend is INT_MIN and divisor is -1, return INT_MAX to prevent overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine the sign of the result
        boolean sign = (dividend < 0) == (divisor < 0);
        
        // Use long to handle cases where dividend or divisor is Integer.MIN_VALUE
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        
        int quotient = 0;
        
        // Perform division using bit manipulation
        while (n >= d) {
            int count = 0;
            while (n >= (d << (count + 1))) {
                count++;
            }
            quotient += 1 << count;
            n -= d << count;
        }
        
        return sign ? quotient : -quotient;
    }
}
// Last updated: 01/01/2026, 10:59:04
1class Solution {
2    public int[] plusOne(int[] digits) {
3        for(int i=digits.length-1; i>=0; i--) {
4            digits[i] = digits[i] + 1;
5            if(digits[i] < 10) {
6                return digits;
7            } 
8            digits[i] = 0;
9        }  
10
11        int ans[] = new int[digits.length + 1];
12        ans[0] = 1;
13        return ans;
14    }
15}
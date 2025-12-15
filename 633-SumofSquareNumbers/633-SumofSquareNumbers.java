// Last updated: 15/12/2025, 12:45:08
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long left =0;
4        long right = (long) Math.sqrt(c);
5        while(left<=right){
6            long k = left*left + right*right;
7            if(k==c) return true;
8            if(k<c) left++;
9            else right--;
10        }
11        return false;
12    }
13}
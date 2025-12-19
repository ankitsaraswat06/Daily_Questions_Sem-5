// Last updated: 19/12/2025, 20:16:26
1class Solution {
2    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
3        int c = 0;
4        for(int el: hours) {
5            if(el>=target) c++;
6        }
7        return c;
8    }
9}
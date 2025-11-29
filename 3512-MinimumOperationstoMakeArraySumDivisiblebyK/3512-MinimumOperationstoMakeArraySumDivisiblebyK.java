// Last updated: 29/11/2025, 07:01:20
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int sum =0 ;
4        for(int el: nums) sum+=el;
5        return sum%k;
6        
7    }
8}
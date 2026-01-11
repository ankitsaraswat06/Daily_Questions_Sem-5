// Last updated: 11/01/2026, 08:13:43
1class Solution {
2    public static boolean isVal(int[] nums, int si, int ei) {
3        int sum = 0;
4        for(int i=si; i<=ei; i++) {
5            sum+=nums[i];
6        }
7        for(int i=si; i<=ei; i++ ) {
8            if(nums[i]==sum) return true;
9        }
10        return false;
11    }
12    public int centeredSubarrays(int[] nums) {
13        int c =0;
14        for(int i=0; i<nums.length; i++) {
15            for(int j=i; j<nums.length; j++) {
16                if(isVal(nums, i, j)) c++;
17            }
18        }
19        return c;
20        
21    }
22}
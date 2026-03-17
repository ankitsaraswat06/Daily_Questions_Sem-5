// Last updated: 17/03/2026, 22:08:06
1class Solution {
2    public int majorityElement(int[] nums) {
3        int v = 1;
4        int cand = nums[0];
5        for(int i=1; i<nums.length; i++) {
6            if(nums[i]==cand) v++;
7            else {
8                v--;
9                if(v==0) {
10                    cand = nums[i];
11                    v = 1;
12                }
13            }
14        }
15        return cand;
16    }
17
18}
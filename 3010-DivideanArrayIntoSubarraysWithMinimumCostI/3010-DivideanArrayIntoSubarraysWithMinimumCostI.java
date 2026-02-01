// Last updated: 01/02/2026, 18:12:39
1class Solution {
2    public int minimumCost(int[] nums) {
3        if(nums.length<=3) {
4            int sum =0;
5            for(int el: nums) sum+=el;
6            return sum;
7        }
8        int sum = Integer.MAX_VALUE;
9
10        for(int j=1; j<nums.length-1; j++) {
11            for(int k=j+1; k<nums.length; k++) {
12                sum = Math.min(nums[0]+nums[j]+nums[k], sum);
13            }
14        }
15        return sum;
16    }
17}
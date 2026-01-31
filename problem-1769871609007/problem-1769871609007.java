// Last updated: 31/01/2026, 20:30:09
1class Solution {
2    public boolean isValid(int[] nums, int mid) {
3        long sum = 0;
4        long limit = (long) mid*mid;
5        for(int el: nums) {
6            sum +=(el+mid-1)/mid;
7            if(sum>limit) return false;
8        }
9        return true;
10    }
11    public int minimumK(int[] nums) {
12        int low = 1;
13        int high = Integer.MIN_VALUE;
14        for(int el: nums) high = Math.max(high, el);
15        high = Math.max(high, nums.length);
16        int ans = -1;
17        while(low<=high) {
18            int mid = low + (high-low)/2;
19            if(isValid(nums,mid)) {
20                ans = mid;
21                high = mid-1;
22            } else {
23                low = mid+1;
24            }
25        }
26        return ans;
27        
28    }
29}
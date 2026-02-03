// Last updated: 03/02/2026, 12:18:01
1class Solution {
2    public boolean isTrionic(int[] nums) {
3        int n = nums.length;
4        int i= 1;
5        while(i<n && nums[i-1] < nums[i]) {
6            i++;
7        }
8        int p = i-1;
9        i = p+1;
10        while(i<n && nums[i-1] > nums[i]) {
11            i++;
12        }
13        int q = i-1;
14        i = q+1;
15        while(i<n && nums[i-1] < nums[i] ) {
16            i++;
17        }
18        
19        return 0<p && p<q && q<n-1 && i == n;
20        
21        
22    }
23}
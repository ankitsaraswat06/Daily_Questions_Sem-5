// Last updated: 14/01/2026, 17:48:53
1class Solution {
2    public long perfectPairs(int[] nums) {
3        int[] sorted = new int[nums.length];
4        for(int i=0; i<nums.length; i++) {
5            sorted[i] = Math.abs(nums[i]);
6        }
7        Arrays.sort(sorted);
8        int i=0, j=1;
9        long ans = 0;
10        while(i<nums.length) {
11            if(j<(i+1)) j = i+1;
12            while(j<nums.length && sorted[j]<=2L*sorted[i]) {
13                j++;
14            }
15            ans+=(j-i-1);
16            i++;
17        }
18        return ans;
19        
20    }
21}
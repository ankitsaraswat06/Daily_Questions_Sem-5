// Last updated: 03/12/2025, 15:17:34
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] pref = new int[nums.length];
4        int[] suff = new int[nums.length];
5
6        pref[0]=1;
7        pref[1] = nums[0];
8        for(int i=2; i<nums.length; i++) {
9            pref[i] = nums[i-1]*pref[i-1];
10        }
11        suff[nums.length-1] = 1;
12        suff[nums.length-2] = nums[nums.length-1];
13        for(int i=nums.length-3; i>=0; i--) {
14            suff[i] = suff[i+1] * nums[i+1];
15        }
16        int ans[] = new int[nums.length];
17
18        for(int i=0; i<nums.length; i++) {
19            ans[i] = pref[i] * suff[i];
20        }
21        
22        return ans;
23
24        
25    }
26}
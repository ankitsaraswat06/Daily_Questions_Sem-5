// Last updated: 10/01/2026, 18:24:00
1class Solution {
2    long ans = 0;
3    public void rec(int[] nums, int idx, List<Long> ll) {
4        if(idx>=nums.length) {
5            if(ll.size()==0) return;
6            long prod = 1;
7            for(long el: ll) prod*=el;
8            ans = Math.max(prod, ans);
9            return;
10        }
11        ll.add((long)nums[idx]);
12        rec(nums, idx+1, ll);
13        ll.remove(ll.size()-1);
14        rec(nums, idx+1, ll);
15    }
16    public long maxStrength(int[] nums) {
17        List<Long> ll = new ArrayList<>();
18        rec(nums, 0, ll);
19        if(ans==0) {
20            ans = Long.MIN_VALUE;
21            for(int el: nums) ans = Math.max(el, ans);
22        }
23        return ans;
24        
25    }
26}
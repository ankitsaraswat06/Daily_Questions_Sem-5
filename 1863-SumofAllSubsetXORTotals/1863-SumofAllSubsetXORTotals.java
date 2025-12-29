// Last updated: 29/12/2025, 12:35:14
1class Solution {
2    int xor;
3    public void rec(int[] nums, int idx, List<Integer> ll) {
4        if(idx==nums.length) {
5            int base = 0;
6            for(int el: ll) {
7                base = base^el;
8            }
9            xor += base;
10
11            return;
12        }
13        ll.add(nums[idx]);
14        rec(nums, idx+1, ll);
15        ll.remove(ll.size()-1);
16        rec(nums, idx+1, ll);
17        
18    }
19    public int subsetXORSum(int[] nums) {
20        List<Integer> ll = new ArrayList<>();
21        xor = 0;
22        rec(nums, 0, ll);
23        return xor;
24    }
25}
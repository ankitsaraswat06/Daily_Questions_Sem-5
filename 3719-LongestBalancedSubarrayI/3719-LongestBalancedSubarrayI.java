// Last updated: 19/01/2026, 22:06:45
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int ans = Integer.MIN_VALUE;
4        for(int i=0; i<nums.length; i++) {
5            TreeMap<Integer, Integer> map = new TreeMap<>();
6                int even=0, odd=0;
7            for(int j=i; j<nums.length; j++) {
8                
9                map.put(nums[j], map.getOrDefault(nums[j],0)+1);
10                if(map.get(nums[j]) == 1) {
11                    if(nums[j]%2==0) even++;
12                    else odd++;
13                }
14                if(even==odd) ans = Math.max(ans, j-i+1);
15            }
16        }
17        return ans==Integer.MIN_VALUE?0:ans;
18    }
19}
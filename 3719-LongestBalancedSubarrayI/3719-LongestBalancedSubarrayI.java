// Last updated: 12/01/2026, 21:36:27
1class Solution {
2    // public boolean isBalanced(int[] nums, int i, int j) {
3    //     TreeMap<Integer, Integer> map = new TreeMap<>();
4    //     for(int idx = i; idx<=j; idx++) {
5    //         map.put(nums[idx], map.getOrDefault(nums[idx], 0)+1);
6    //     }
7    //     int even = 0, odd = 0;
8    //     for(int k: map.keySet()) {
9    //         if(k%2==0) even++;
10    //         if(k%2!=0) odd++;
11    //     }
12    //     return even==odd;
13    // }
14    public int longestBalanced(int[] nums) {
15        int ans = Integer.MIN_VALUE;
16        for(int i=0; i<nums.length; i++) {
17            TreeMap<Integer, Integer> map = new TreeMap<>();
18                int even=0, odd=0;
19            for(int j=i; j<nums.length; j++) {
20                
21                map.put(nums[j], map.getOrDefault(nums[j],0)+1);
22                if(map.get(nums[j]) == 1) {
23                    if(nums[j]%2==0) even++;
24                    else odd++;
25                }
26                if(even==odd) ans = Math.max(ans, j-i+1);
27            }
28        }
29        return ans==Integer.MIN_VALUE?0:ans;
30    }
31}
// Last updated: 11/01/2026, 21:48:38
1class Solution {
2    public int minLength(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        int j=0, i=0;
5        int sum = 0;
6        int ans = Integer.MAX_VALUE;
7        while(j<nums.length) {
8            if(!map.containsKey(nums[j]) || map.get(nums[j])==0) {
9                sum+=nums[j];
10                map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
11            } else {
12                map.put(nums[j], map.get(nums[j])+1);
13            }
14            while(sum>=k) {
15                ans = Math.min(ans, j-i+1);
16                map.put(nums[i], map.get(nums[i])-1);
17                if(map.get(nums[i])==0) {
18                    sum-=nums[i];
19                }
20                i++;
21            }
22            
23            j++;
24            // System.out.println(map);
25        }
26        return ans==Integer.MAX_VALUE?-1:ans;
27        
28    }
29}
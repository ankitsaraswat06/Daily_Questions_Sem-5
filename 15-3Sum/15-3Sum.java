// Last updated: 13/01/2026, 14:35:08
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> ans = new ArrayList<>();
5        for(int i=0; i<nums.length; i++) {
6            if(i>0 && nums[i]==nums[i-1]) {
7                continue;
8            }
9            int j = i+1;
10            int k = nums.length-1;
11            while(j<k) {
12                int sum = nums[i]+nums[j]+nums[k];
13                if(sum>0) {
14                    k--;
15                } else if(sum<0) {
16                    j++;
17                } else {
18                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
19                    j++;
20                    while(j<k && nums[j]==nums[j-1]) {
21                        j++;
22                    }
23                }
24            }
25        }
26        return ans;
27        
28    }
29}
// Last updated: 20/12/2025, 20:24:28
1class Solution {
2    public int minOperations(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        int left = -1;
5        for(int i=nums.length-1; i>=0; i--) {
6            if(set.contains(nums[i])) {
7                left = i+1;
8                break;
9            }
10            set.add(nums[i]);
11        }
12        if(left==-1) return 0;
13        return (left+2)/3;
14        
15    }
16}
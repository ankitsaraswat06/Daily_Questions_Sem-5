// Last updated: 13/01/2026, 15:45:57
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        for(int i=0; i<nums.length; i++) {
4            while(nums[i]>=1 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]) {
5                int k = nums[i]-1;
6                int temp = nums[k];
7                nums[k] = nums[i];
8                nums[i] = temp;
9            }
10        }
11        
12        for(int i=0; i<nums.length; i++) {
13            if(nums[i]!=i+1) return i+1;
14        }
15        return nums.length+1;
16        
17    }
18}
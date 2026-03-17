// Last updated: 17/03/2026, 22:24:08
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0;
4        
5        for(int n: nums) {
6            if( i<2 || n!=nums[i-2]){
7                nums[i] = n;
8                i++;
9            }
10        }
11
12        return i;
13        
14    }
15}
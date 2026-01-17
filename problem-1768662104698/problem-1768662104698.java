// Last updated: 17/01/2026, 20:31:44
1class Solution {
2    public int minOperations(int[] nums, int[] target) {
3       HashSet<Integer> st = new HashSet<>();
4        for(int i=0; i<nums.length; i++) {
5            if(nums[i]!=target[i]) st.add(nums[i]);
6        }
7        return st.size();
8        
9    }
10}
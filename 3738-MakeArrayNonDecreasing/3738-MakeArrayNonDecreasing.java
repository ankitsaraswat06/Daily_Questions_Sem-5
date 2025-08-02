// Last updated: 02/08/2025, 15:28:27
class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<nums.length; i++) {
            if(!st.isEmpty() && nums[i] < st.peek()) {
                continue;
            }
            st.push(nums[i]);
        }
        return st.size();
    }
}
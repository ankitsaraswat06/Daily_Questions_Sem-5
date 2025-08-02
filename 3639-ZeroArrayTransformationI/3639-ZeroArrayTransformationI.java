// Last updated: 02/08/2025, 15:28:51
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int op[] = new int[nums.length+1];
        for(int i=0; i<queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            op[left]++;
            op[right+1]--;
        }
        for(int i=1; i<op.length; i++) {
            op[i] = op[i] + op[i-1];
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i]-op[i] > 0) return false;
        }   
        return true;
    }
}
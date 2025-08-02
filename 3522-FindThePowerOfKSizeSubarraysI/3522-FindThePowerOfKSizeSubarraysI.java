// Last updated: 02/08/2025, 15:28:58
class Solution {
    public boolean isConsAndSorted(int[] nums, int si, int ei) {
        for(int i=si+1; i<=ei; i++) {
            if(Math.abs(nums[i]- nums[i-1]) != 1 || nums[i-1] > nums[i]) {
                return false;
            }
        }
        return true;
    }
    public int[] resultsArray(int[] nums, int k) { 
        int[] ans = new int[nums.length-(k-1)];
        int idx = 0;
        int i=0;
        for(int j=k-1; j<nums.length; j++) {
            if(j-i+1==k) {
                if(isConsAndSorted(nums, i, j)) {
                    ans[idx++] = nums[j];
                } else {
                    ans[idx++] = -1; 
                }
                i++;
            }
        }
        return ans;

    }
}
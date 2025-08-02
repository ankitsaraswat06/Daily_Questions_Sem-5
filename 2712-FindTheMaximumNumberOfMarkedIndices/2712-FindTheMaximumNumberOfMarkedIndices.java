// Last updated: 02/08/2025, 18:52:33
class Solution {
    public static boolean isPossible (int[] nums, int mid) {
        int count = 0;
        for(int i=0; i<mid; i++) {
            if(2*nums[i] <= nums[nums.length-(mid-i)]) {
                count ++;
            }
        }
        return count>=mid;

    }
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int lo = 1;
        int hi = nums.length/2;
        int ans = 0;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(isPossible(nums, mid)) {
                ans = mid;
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return ans*2;
    }
}
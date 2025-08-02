// Last updated: 02/08/2025, 18:56:50
class Solution {
    public static boolean isPossible(int[] nums, int mid, int k) {
        int sum =0;
        int count = 1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > mid) {
                return false;
            }
            if(sum + nums[i] > mid) {
                count++;
                sum = nums[i];
                if(count>k) {
                    return false;
                }
            } else {
                sum+=nums[i];
            }

        }

        return count<=k;


    }
    public int splitArray(int[] nums, int k) {
        // Arrays.sort(nums);
        int lo = 0;
        int hi = 0;
        for(int i=0; i<nums.length; i++) {
            hi+=nums[i];
            lo = Math.max(lo, nums[i]);
        }
        int ans = hi;

        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(isPossible(nums,mid, k)) {
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }

        return ans;
        
    }
}
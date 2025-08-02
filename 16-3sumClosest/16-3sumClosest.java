// Last updated: 02/08/2025, 18:59:53
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(nums);

        for(int i=0; i<=nums.length -3; i++) {
            if(i>0 && nums[i]== nums[i-1]) {
                continue;
            }

            int j = i+1;
            int k = nums.length-1;

            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum== target) {
                    return sum;
                }
                if(Math.abs(sum-target) < minDiff) {
                    ans = sum;
                    minDiff = Math.abs(sum-target);
                }
                if(sum<target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
        
    }
}
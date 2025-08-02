// Last updated: 02/08/2025, 18:56:11
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i, j;
        for(int k = nums.length-1; k>=0; k--) {
            for(i=0,j = k-1; i<j;) {
                if(nums[i] + nums[j] > nums[k]) {
                    count+=j-i;
                    j--;
                } else {
                    i++;
                }
            }
        }

        return count;
        
    }
}
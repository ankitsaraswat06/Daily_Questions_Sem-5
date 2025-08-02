// Last updated: 02/08/2025, 18:54:44
class Solution {
    public int minDeletion(int[] nums) {
        int cnt = 0;
        boolean isEven = true;
        for(int i=0; i<nums.length-1; i++) {
            if(isEven && nums[i] == nums[i+1]) {
                cnt++;
            } else {
                isEven = !isEven;
            }
        }
        if((nums.length-cnt)%2!=0) cnt++;
        return cnt;
    }
}
// Last updated: 03/08/2025, 16:52:15
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i= 1;
        while(i<n && nums[i-1] < nums[i]) {
            i++;
        }
        int p = i-1;
        i = p+1;
        while(i<n && nums[i-1] > nums[i]) {
            i++;
        }
        int q = i-1;
        i = q+1;
        while(i<n && nums[i-1] < nums[i] ) {
            i++;
        }
        
        return 0<p && p<q && q<n-1 && i == n;
        
        
    }
}
// Last updated: 31/10/2025, 05:44:29
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length-2];
        for(int i=0; i<nums.length; i++) {
            freq[nums[i]]++;
        }
        int[] ans = new int[2];
        int idx=0;
        for(int i=0; i<freq.length; i++) {
            if(freq[i]==2) ans[idx++] = i;
        }
        return ans;
        
    }
}
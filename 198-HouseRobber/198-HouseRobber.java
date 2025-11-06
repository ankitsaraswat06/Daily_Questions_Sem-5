// Last updated: 06/11/2025, 14:53:06
class Solution {

    public int rob(int[] arr) {
       int prev2 =0;
        int prev = arr[0];
        for(int i=1; i<arr.length; i++) {
            int pick = arr[i] + prev2;
            int nonpick = prev;
            int curr = Math.max(pick, nonpick);
            prev2 = prev;
            prev = curr;

        }
        return prev; 
    }
}
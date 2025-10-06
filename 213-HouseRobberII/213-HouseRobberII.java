// Last updated: 06/10/2025, 11:48:12
class Solution {
    public int rob(int[] arr) {
        if(arr.length==1) return arr[0];
        int prev2 =0;
        int prev = arr[0];
        for(int i=1; i<arr.length-1; i++) {
            int pick = arr[i] + prev2;
            int nonpick = prev;
            int curr = Math.max(pick, nonpick);
            prev2 = prev;
            prev = curr;

        }
        int ans1 = prev;
        prev2 =0;
        prev = arr[1];
        for(int i=2; i<arr.length; i++) {
            int pick = arr[i] + prev2;
            int nonpick = prev;
            int curr = Math.max(pick, nonpick);
            prev2 = prev;
            prev = curr;

        }
        int ans2 = prev;
        return Math.max(ans1, ans2);
    }
}
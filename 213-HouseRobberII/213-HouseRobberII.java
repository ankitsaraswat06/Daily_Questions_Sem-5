// Last updated: 06/11/2025, 14:58:00
class Solution {
    public int findRob(int[] arr, int si, int ei) {
        int prev2 = 0;
        int prev = arr[si];
        for(int i=si+1; i<=ei; i++) {
            int take = arr[i] + prev2;
            int nontake = prev + 0;
            int curr = Math.max(take, nontake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public int rob(int[] arr) {
        if(arr.length==1) return arr[0];
        int a = findRob(arr, 0, arr.length-2);
        int b = findRob(arr, 1, arr.length-1);
        return Math.max(a,b);
    }
}
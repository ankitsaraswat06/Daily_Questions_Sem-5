// Last updated: 03/09/2025, 12:35:40
class Solution {
    public int lengthOfLIS(int[] arr) {
        int dp[] = new int[arr.length];
        Arrays.fill(dp, 1);
        for(int i=1; i<arr.length; i++) {
            for(int j=i-1; j>=0; j--) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();

    }
}
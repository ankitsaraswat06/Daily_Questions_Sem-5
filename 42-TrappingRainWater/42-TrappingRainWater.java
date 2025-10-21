// Last updated: 21/10/2025, 15:41:12
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lM = new int[n];
        lM[0] = height[0];
        for(int i=1; i<n; i++) {
            lM[i] = Math.max(lM[i-1], height[i]);
        }
        int rM[] = new int[n];
        rM[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rM[i] = Math.max(rM[i+1], height[i]);
        }

        int tW = 0;
        for(int i=0; i<n; i++) {
            tW = tW + Math.min(rM[i], lM[i]) - height[i];
        }

        return tW;

    }
}
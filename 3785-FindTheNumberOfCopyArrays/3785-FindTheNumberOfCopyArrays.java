// Last updated: 02/08/2025, 15:28:19
class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int l=bounds[0][0];
        int e=bounds[0][1];
        for(int i=1;i<original.length;i++){
            int diff=original[i]-original[i-1];
            l=Math.max(l+diff,bounds[i][0]);
            e=Math.min(e+diff,bounds[i][1]);

            if(l>e){
                return 0;
            }
        }
        return e-l+1;
    }
}
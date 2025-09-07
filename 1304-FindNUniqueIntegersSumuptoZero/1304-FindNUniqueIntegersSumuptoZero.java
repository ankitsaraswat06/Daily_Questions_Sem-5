// Last updated: 07/09/2025, 16:48:19
class Solution {
    public int[] sumZero(int n) {
        int[] ans= new int[n];
        int count = 1, i=0;
        while(count <= n/2) {
            ans[i++] = count;
            ans[i++] = (-1) *count;
            count++;
        }
        return ans;

    }
}
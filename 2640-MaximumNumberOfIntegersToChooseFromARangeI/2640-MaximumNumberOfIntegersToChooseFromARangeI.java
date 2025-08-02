// Last updated: 02/08/2025, 18:52:40
class Solution {
    public boolean isPresent(int[] banned, int n) {
        for(int i=0; i<banned.length; i++) {
            if(banned[i] == n) {
                return true;
            }
        }
        return false;
    }
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum = 0;
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(sum + i <= maxSum && !isPresent(banned, i)) {
                count++;
                sum+=i;
            }
        }
        return count;
    }
}
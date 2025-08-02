// Last updated: 02/08/2025, 18:54:14
class Solution {
    public int kthFactor(int n, int k) {

        int count = 0;

        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                count++;
                if(count==k) {
                    return i;
                }
            }
        }

        return -1;
        
    }
}
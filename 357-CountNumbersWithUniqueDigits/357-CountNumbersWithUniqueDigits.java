// Last updated: 02/08/2025, 18:57:07
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int ans = 10;
        int start = 9;
        int current = 9;
        while(n-->1) {
            current = current * (start--);
            ans = ans + current;
        }  
        return ans;  
    }
}
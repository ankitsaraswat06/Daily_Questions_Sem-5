// Last updated: 02/08/2025, 18:59:58
class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int p = x;
        while(x>0) {
            sum= sum*10 + (x%10);
            x/=10;
        }

        if(p==sum) {
            return true;
        } else {
            return false;
        }

        
    }
}
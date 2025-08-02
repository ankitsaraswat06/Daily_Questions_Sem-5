// Last updated: 02/08/2025, 18:55:35
class Solution {
    public boolean isPalindrome(int n) {
        if(n<10){
            return true;
        }
        String str = String.valueOf(n);;
        int i=0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPrime(int item) {
        if(item==1 || item==0) return false;
        for(int i=2; i*i<=item; i++) {
            if(item%i==0) return false;
        }
        return true;
    }
    public int primePalindrome(int n) {
        int item = n;
        while(true) {
            if(isPrime(item) && isPalindrome(item)) {
                return item;
            }
            item++;
            if (10_000_000 < item && item < 100_000_000) {
                item = 100_000_000;
            }
        }
    }
}
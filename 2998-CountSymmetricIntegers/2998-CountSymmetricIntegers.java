// Last updated: 02/08/2025, 18:52:20
class Solution {
    public boolean isSymmetric(int x) {
        int digits = 0;
        int n = x;
        while(x>0) {
            x/=10;
            digits++;
        }
        if(digits%2!=0) return false;
        int k = 0;
        int ls = 0;
        while(true) {
            ls+= n%10;
            n/=10;
            k++;
            if(k==digits/2) break;
        }
        k = 0;
        int fs = 0;
        while(true) {
            fs+=n%10;
            n/=10;
            k++;
            if(k==digits/2) break;
        }
        return ls == fs;
    }
    public int countSymmetricIntegers(int low, int high) {
        int i=low;
        int count =0;
        while(i<=high) {
            if(isSymmetric(i)) count++;
            i++;
        }
        return count;
        
    }
}
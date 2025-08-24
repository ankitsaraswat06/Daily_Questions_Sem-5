// Last updated: 24/08/2025, 11:11:44
class Solution {
    public int gcd(int n1, int n2) {
        while(n1%n2!=0) {
            int rem= n1%n2;
            n1=n2;
            n2=rem;
        }
        return n2;
    }
    public int gcdOfOddEvenSums(int n) {
        int eC = 0, oC = 0, oS=0, eS=0;
        int i=1;
        while(true) {
            if(i%2!=0) {
                oS+=i;
                oC++;
            } else {
                eS+=i;
                eC++;
            }
            i++;
            if(eC==n && oC==n) break;
        }
        return gcd(oS, eS);
    }
}
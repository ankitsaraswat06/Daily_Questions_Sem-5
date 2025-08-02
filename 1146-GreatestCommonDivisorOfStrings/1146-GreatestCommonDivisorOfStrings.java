// Last updated: 02/08/2025, 18:54:57
class Solution {
    public int findGcd(int n1, int n2) {
        while(n2!=0) {
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        return n1;
    }
    public String gcdOfStrings(String str1, String str2) {
        int f1= 0;
        if((str1+str2).equals(str2+str1)) f1 = 1;
        if(f1==0) return "";
        int gcd = findGcd(str1.length(), str2.length());
        // System.out.print(gcd);
        return str1.substring(0, gcd);
    }
}
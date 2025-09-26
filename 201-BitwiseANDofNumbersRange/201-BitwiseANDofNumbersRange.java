// Last updated: 26/09/2025, 11:43:32
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int c = 0;
        while(left<right) {
            left = left>>1;
            right = right>>1;
            c++;
        }
        return right<<c;
    }
}
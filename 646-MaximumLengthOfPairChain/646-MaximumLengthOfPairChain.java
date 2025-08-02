// Last updated: 02/08/2025, 18:56:06
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int c = 1, l = pairs[0][1];
        for(int i=1; i<pairs.length; i++) {
            if(pairs[i][0] > l) {
                c++;
                l = pairs[i][1];
            } 
        }
        return c;
    }
}
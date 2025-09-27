// Last updated: 27/09/2025, 08:56:40
class Solution {
    public int totalFruit(int[] fruits) {
       int [] freq = new int[fruits.length];
       int si = 0, ei=0;
       int ans = Integer.MIN_VALUE;
       int type = 0;
       while(ei<fruits.length) {
        if(freq[fruits[ei]]==0) {
            type++;
        }
        freq[fruits[ei]]++;
        while(type>2) {
            freq[fruits[si]]--;
            if(freq[fruits[si]] == 0) type--;
            si++;
        }
        ans = Math.max(ans, ei-si+1);
        ei++;
       } 
       return ans;
    }
}
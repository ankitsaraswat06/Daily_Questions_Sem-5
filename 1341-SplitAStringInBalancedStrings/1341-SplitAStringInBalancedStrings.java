// Last updated: 02/08/2025, 18:54:48
class Solution {
    public int balancedStringSplit(String s) {
        int freq[] = new int[2];
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='L') freq[0]++;
            else freq[1]++;
            if(freq[0] == freq[1]) {
                ans++;
                freq[0] = 0;
                freq[1] = 0;
            }
        }
        return ans;
    }
}
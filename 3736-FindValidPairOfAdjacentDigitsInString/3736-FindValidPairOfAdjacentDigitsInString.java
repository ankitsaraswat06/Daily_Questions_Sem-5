// Last updated: 02/08/2025, 15:28:29
class Solution {
    public String findValidPair(String s) {
        int freq[] = new int[10];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'0']++;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=1; i<s.length(); i++) {
            int curr = s.charAt(i)-'0';
            int prev = s.charAt(i-1)-'0';
            if(curr!=prev && freq[curr] == (int)curr && freq[prev] == (int)prev) {
                ans.append(s.charAt(i-1));
                ans.append(s.charAt(i));
                break;
            }
        }
        return ans.toString();
        
    }
}
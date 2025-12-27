// Last updated: 27/12/2025, 23:24:55
1class Solution {
2    public boolean isBalanced(int[] freq) {
3        int count = 0;
4        for (int x : freq) {
5            if (x == 0) continue;
6            if (count == 0) count = x;
7            else if (count != x) return false;
8        }
9        return true;
10    }
11    public int longestBalanced(String s) {
12        int len = Integer.MIN_VALUE;
13        for(int i=0; i<s.length(); i++) {
14            int[] freq = new int[26];
15            for(int j=i; j<s.length(); j++) {
16                freq[s.charAt(j) - 'a']++;
17                if (isBalanced(freq))
18                    len = Math.max(len, j - i + 1);
19            }
20        }
21        return len;
22        
23    }
24}
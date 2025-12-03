// Last updated: 03/12/2025, 15:09:21
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq = new int[26];
4        for(int i=0; i<s.length(); i++) freq[s.charAt(i)-'a']++;
5        int ans =-1;
6        for(int i=0; i<s.length(); i++) {
7            if(freq[s.charAt(i)-'a']!=0 && freq[s.charAt(i)-'a']==1) {
8                ans = i;
9                break;
10            }
11        }
12        return ans;
13        
14    }
15}
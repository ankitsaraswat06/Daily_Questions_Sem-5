// Last updated: 26/01/2026, 14:32:45
1class Solution {
2    public char findTheDifference(String s, String t) {
3        int[] freq = new int[26];
4        char ans= 'a';
5        for(int i=0; i<s.length(); i++) {
6            freq[s.charAt(i)-'a']++;
7        }
8        for(int i=0; i<t.length(); i++) {
9            freq[t.charAt(i)-'a']++;
10        }
11        for(int i=0; i<26; i++) {
12            if(freq[i]%2!=0) {
13                ans = (char)(i+'a');
14                break;
15            }
16        }
17        return ans;
18        
19    }
20}
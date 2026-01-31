// Last updated: 31/01/2026, 12:08:53
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        for(char ch: letters) {
4            if(ch>target) {
5                return ch;
6            }
7        }
8        return letters[0];
9        
10    }
11}
// Last updated: 04/01/2026, 11:23:02
1class Solution {
2    public int maxRepeating(String s, String word) {
3        int count = 0;
4        String temp = word;
5
6        while (s.contains(temp)) {
7            count++;
8            temp += word;
9        }
10
11        return count;
12    }
13}
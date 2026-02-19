// Last updated: 19/02/2026, 14:53:24
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int currentCount = 1;
4        int previousCount = 0;
5        int ans = 0;
6        for(int i=1; i<s.length(); i++) {
7            if(s.charAt(i) == s.charAt(i-1)) {
8                currentCount++;
9            } else {
10                ans+=Math.min(currentCount, previousCount);
11                previousCount = currentCount;
12                currentCount = 1;
13            }
14        }
15        ans+=Math.min(currentCount, previousCount);
16        return ans;
17    }
18}
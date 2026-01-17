// Last updated: 17/01/2026, 17:11:12
1class Solution {
2    public int maxDepth(String s) {
3        int ans = 0;
4        int c = 0;
5        for(int i=0; i<s.length(); i++) {
6            char ch= s.charAt(i);
7            if(ch=='(') c++;
8            else if(ch==')') c--;
9            ans = Math.max(c, ans);
10        }
11        return ans;
12    }
13}
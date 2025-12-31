// Last updated: 31/12/2025, 22:59:03
1class Solution {
2    public void rec(int n, String s, int open, int close , List<String> ans) {
3        if(open==n && close==n) {
4            ans.add(s);
5            return;
6        }
7        if(open < n) {
8            rec(n, s+"(" , open+1, close, ans);
9        }
10        if(close<open) {
11            rec(n, s+")", open, close+1, ans);
12        }
13    }
14    public List<String> generateParenthesis(int n) {
15        List<String> ans= new ArrayList<>();
16        rec(n, "", 0, 0,ans);
17        return ans;
18    }
19}
// Last updated: 04/10/2025, 12:19:04
class Solution {
    public void rec(int n, String s, int open, int close , List<String> ans) {
        if(open==n && close==n) {
            ans.add(s);
            return;
        }
        if(open < n) {
            rec(n, s+"(" , open+1, close, ans);
        }
        if(close<open) {
            rec(n, s+")", open, close+1, ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        rec(n, "", 0, 0,ans);
        return ans;
    }
}
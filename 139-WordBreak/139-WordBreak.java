// Last updated: 05/01/2026, 13:08:41
1class Solution {
2
3    public boolean solve(String s, int idx, Set<String> dict, Boolean[] dp) {
4        if (idx == s.length()) return true;
5        if(dp[idx]!=null) return dp[idx];
6
7        for (int end = idx + 1; end <= s.length(); end++) {
8            String part = s.substring(idx, end);
9            if (dict.contains(part)) {
10                if (solve(s, end, dict, dp)) {
11                    return dp[idx] = true;
12                }
13            }
14        }
15
16        return dp[idx] = false;
17    }
18
19    public boolean wordBreak(String s, List<String> wordDict) {
20        Set<String> dict = new HashSet<>(wordDict);
21        Boolean[] dp = new Boolean[s.length()+1];
22        return solve(s, 0, dict, dp);
23    }
24}
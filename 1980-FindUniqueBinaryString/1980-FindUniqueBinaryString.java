// Last updated: 08/03/2026, 09:58:34
1class Solution {
2    String ans = "";
3    public void rec(int n, String ques, HashSet<String> set) {
4        if(ques.length()==n) {
5            if(!set.contains(ques)) {
6                ans = ques;
7            }
8            return;
9        }
10        rec(n, ques+0, set);
11        rec(n, ques+1, set);
12    }
13    public String findDifferentBinaryString(String[] nums) {
14        int n = nums.length;
15        HashSet<String> set = new HashSet<>();
16        for(String str: nums) set.add(str);
17        rec(n, "", set);
18        return ans;
19
20    }
21}
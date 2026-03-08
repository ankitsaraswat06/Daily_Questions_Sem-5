// Last updated: 08/03/2026, 09:54:53
1class Solution {
2    public void rec(int n, String ques, List<String> ll) {
3        if(ques.length()==n) {
4            ll.add(ques);
5            return;
6        }
7        rec(n, ques+0, ll);
8        rec(n, ques+1, ll);
9    }
10    public String findDifferentBinaryString(String[] nums) {
11        int n = nums.length;
12        List<String> ll = new ArrayList<>();
13        rec(n, "", ll);
14        HashSet<String> set = new HashSet<>();
15        for(String str: nums) set.add(str);
16        for(String str: ll) {
17            if(!set.contains(str)) return str;
18        }
19        return "";
20    }
21}
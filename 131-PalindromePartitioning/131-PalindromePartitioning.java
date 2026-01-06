// Last updated: 06/01/2026, 12:40:39
1class Solution {
2    public boolean isPal(String str) {
3        int i=0; 
4        int j = str.length()-1;
5        while(i<j) {
6            if(str.charAt(i)!=str.charAt(j)) return false;
7            i++;
8            j--;
9        }
10        return true;
11    }
12    public void rec(String s, String ques, List<String> ll, List<List<String>> ans) {
13        if(s.length()==0) {
14            ans.add(new ArrayList<>(ll));
15            return;
16        }
17        for(int cut = 1; cut<=s.length(); cut++) {
18            String str = s.substring(0, cut);
19            if(isPal(str)) {
20                ll.add(str);
21                rec(s.substring(cut), str, ll, ans);
22                ll.remove(ll.size()-1);
23            }
24        }
25    }
26    public List<List<String>> partition(String s) {
27        List<List<String>> ans = new ArrayList<>();
28        List<String> ll = new ArrayList<>();
29        rec(s, "", ll, ans);
30        return ans;
31        
32    }
33}
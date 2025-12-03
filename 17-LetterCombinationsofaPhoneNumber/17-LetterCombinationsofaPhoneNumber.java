// Last updated: 03/12/2025, 15:00:25
1class Solution {
2    String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz"};
3    public void rec(String ques, String ans, List<String> ll) {
4        if(ques.length()==0) {
5            ll.add(ans);
6            return;
7        }
8        String found = str[ques.charAt(0)-'0'];
9        for(int i=0; i<found.length(); i++) {
10            rec(ques.substring(1), ans+found.charAt(i) , ll);
11        }
12    }
13    public List<String> letterCombinations(String digits) {
14        List<String> ll = new ArrayList<>();
15        rec(digits, "", ll);
16        return ll;
17        
18    }
19}
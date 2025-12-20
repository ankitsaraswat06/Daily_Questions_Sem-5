// Last updated: 20/12/2025, 10:43:50
1class Solution {
2    public boolean isVal(String word, Set<String> st) {
3        for(int i=1; i<=word.length(); i++) {
4            String pref = word.substring(0, i);
5            if(!st.contains(pref)) return false;
6        }
7        return true;
8    }
9    public String longestWord(String[] words) {
10        Set<String> st = new HashSet<>();
11        for(String word: words) st.add(word);
12        List<String> ans = new ArrayList<>();
13        for(String word: words) {
14            if(isVal(word, st)) ans.add(word);
15        }
16        Collections.sort(ans, new Comparator<String>() {
17            public int compare(String s1, String s2) {
18                if(s1.length()==s2.length()) {
19                    return s1.compareTo(s2);
20                } else {
21                    return s2.length()-s1.length();
22                }
23            }
24        });
25        if(ans.size()!=0) return ans.get(0);
26        else return "";
27
28
29        
30    }
31}
// Last updated: 04/01/2026, 15:27:20
1class Solution {
2    HashMap<String , Integer> map = new HashMap<>();
3
4    public int numDecodings(String s) {
5        return answer(s);
6    }
7
8    public int answer(String s){
9        if(s.length() == 0){
10            return 1;
11        }
12
13        if(map.containsKey(s)){
14            return map.get(s);
15        }
16        int ans =0;
17        for(int cut =1 ;cut <=s.length(); cut++){
18            String sub = s.substring(0,cut);
19            if(isValid(sub)){
20                ans += answer(s.substring(cut));
21            }
22        }
23        map.put(s, ans);
24        return ans;
25
26    }
27    public boolean isValid(String s){
28        if(s.length() == 0){
29            return false;
30        }
31        if(s.charAt(0) == '0' || s.length()>=3 || Integer.parseInt(s)> 26){
32            return false;
33        }
34        return true;
35    }
36}
// Last updated: 18/01/2026, 08:03:29
1class Solution {
2    public int vowelConsonantScore(String s) {
3        int c=0, v=0;
4        for(int i=0; i<s.length(); i++){
5            char ch = s.charAt(i);
6            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') v++;
7            else if(ch>='a' && ch<='z') c++;
8        }
9        if(c>0) {
10            return (int)Math.floor(v/c);
11        } else {
12            return 0;
13        }
14        
15    }
16}
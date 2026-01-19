// Last updated: 19/01/2026, 15:05:24
1class Solution {
2    public boolean checkValidString(String s) {
3        int minOpen = 0;
4        int maxOpen = 0;
5        for(int i=0; i<s.length(); i++) {
6            if(s.charAt(i)=='(') {
7                minOpen++;
8                maxOpen++;
9            } else if(s.charAt(i)==')') {
10                minOpen--;
11                maxOpen--;
12            } else {
13                minOpen--;
14                maxOpen++;
15            }
16            if(minOpen<0) minOpen =0;
17            if(maxOpen<0) return false;
18        }
19        return minOpen==0;
20        
21    }
22}
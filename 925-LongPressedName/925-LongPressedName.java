// Last updated: 20/12/2025, 18:04:41
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i=0, j=0;
4        while(i<name.length() && j<typed.length()) {
5            if(name.charAt(i)==typed.charAt(j)) {
6                i++;
7                j++;
8            } else if(j>=1 && typed.charAt(j-1)==typed.charAt(j)) {
9                j++;
10            } else return false;
11        }
12        while(j<typed.length()) {
13            if(typed.charAt(j)!=typed.charAt(j-1)) return false;
14            j++;
15        }
16        
17        if(i<name.length()) return false;
18        return true;
19        
20    }
21}
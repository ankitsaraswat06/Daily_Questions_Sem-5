// Last updated: 23/12/2025, 18:46:37
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        // optimal approach
4        if(!(s1.charAt(0)==s2.charAt(0) && s2.charAt(0)==s3.charAt(0))) return -1;
5        int i=0;
6        while(i<s1.length() && i<s2.length() && i<s3.length() && s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)) {
7            i++;
8        }
9        return s1.length()-i + s2.length()-i + s3.length()-i;
10    }
11}
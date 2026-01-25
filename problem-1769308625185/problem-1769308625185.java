// Last updated: 25/01/2026, 08:07:05
1class Solution {
2    public int minimumPrefixLength(int[] arr) {
3        int j=-1;
4        for(int i=1; i<arr.length; i++) {
5            if(arr[i-1]>=arr[i]) {
6                j=i-1;
7            }  
8        }
9
10        return j+1;
11        
12        
13    }
14}
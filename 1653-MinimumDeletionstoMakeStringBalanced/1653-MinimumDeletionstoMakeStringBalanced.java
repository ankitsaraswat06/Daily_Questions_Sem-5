// Last updated: 07/02/2026, 22:16:40
1class Solution {
2    public int minimumDeletions(String s) {
3        int[] aAfter = new int[s.length()];
4        aAfter[s.length()-1] = 0;
5        for(int i=s.length()-2; i>=0; i--) {
6            aAfter[i] = aAfter[i+1] + (s.charAt(i+1)=='a'?1:0);
7            // System.out.println(aAfter[i]);
8        }
9        int[] bBefore = new int[s.length()];
10        bBefore[0] = 0;
11        for(int i=1; i<s.length(); i++) {
12            bBefore[i] = bBefore[i-1] + (s.charAt(i-1)=='b'?1:0);
13        }
14        int ans = Integer.MAX_VALUE;
15        for(int i=0; i<s.length(); i++) {
16            ans = Math.min(ans, aAfter[i]+bBefore[i]);
17        }
18        return ans;
19        
20    }
21}
// Last updated: 28/01/2026, 23:45:22
1class Solution {
2    public boolean rec(int[] arr, int idx, Boolean[] dp, boolean[] visited) {
3        if(idx<0 || idx>=arr.length) return false;
4        if(arr[idx]==0) return true;
5        if(dp[idx]!=null) return dp[idx];
6        
7        // forward
8        boolean a = false;
9        if(!visited[idx]) {
10            visited[idx] = true;
11            a = rec(arr, idx+arr[idx],  dp, visited);
12            visited[idx] = false;
13        }
14        boolean b = false;
15        if(!visited[idx]) {
16            visited[idx] = true;
17            b = rec(arr, idx-arr[idx],  dp, visited);
18            visited[idx] = false;
19        }
20        
21        //back
22        
23        return dp[idx] = a||b;
24    }
25    public boolean canReach(int[] arr, int start) {
26        Boolean[] dp = new Boolean[arr.length];
27        boolean visited[] = new boolean[arr.length];
28        return rec(arr, start, dp, visited);
29        
30    }
31}
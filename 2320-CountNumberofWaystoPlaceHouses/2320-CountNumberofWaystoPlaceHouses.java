// Last updated: 16/01/2026, 22:53:31
1
2class Solution {
3    static int  solve(int n,int i,Integer[] dp){
4        if(i>n) return 1;
5        if(dp[i]!=null) return dp[i];
6        int a = solve(n,i+1,dp);
7        int b = solve(n,i+2,dp);
8        return dp[i] = (a+b)%1000000007;
9    }
10    public int countHousePlacements(int n) {
11        Integer[] dp = new Integer[n+1];
12        long ans = (long)solve(n,1,dp);
13        return (int)((ans*ans)%1000000007);
14    }
15}
// Last updated: 13/01/2026, 22:13:47
1class Solution {
2    public int largestPrime(int n) {
3        boolean isPrime[] = new boolean[n+1];
4        Arrays.fill(isPrime, true);
5        isPrime[0] = false;
6        isPrime[1] = false;
7        for(int i=2; i*i<=n; i++) {
8            if(!isPrime[i]) continue;
9            for(int j=i*i; j<=n; j+=i) {
10                isPrime[j] = false;
11            }
12        }
13        int sum = 0;
14        int ans = 0;
15        for(int i=2; i<=n; i++) {
16            if(isPrime[i]) sum+=i;
17            if(sum>n) break;
18            if(isPrime[sum]) ans = Math.max(ans, sum);
19        }
20        return ans;
21        
22    }
23}
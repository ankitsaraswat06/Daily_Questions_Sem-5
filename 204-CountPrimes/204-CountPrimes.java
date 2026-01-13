// Last updated: 13/01/2026, 15:01:19
1class Solution {
2    public int countPrimes(int n) {
3        if(n==0 || n==1) return 0;
4        boolean[] isPrime = new boolean[n];
5        Arrays.fill(isPrime, true);
6        isPrime[0] = false;
7        isPrime[1] = false;
8        for(int i=2; i*i<n; i++) {
9            if(isPrime[i]==false) continue;
10            for(int j=i*i; j<n; j+=i) {
11                isPrime[j] = false;
12            }
13        }
14        // System.out.println(Arrays.toString(isPrime));
15
16
17        int c = 0;
18        for(boolean el: isPrime) {
19            if(el) c++;
20        }
21        return c;
22        
23    }
24}
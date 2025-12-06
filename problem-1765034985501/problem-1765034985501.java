// Last updated: 06/12/2025, 20:59:45
1class Solution {
2    public boolean isPrime(long n) {
3        if(n<=1) return false;
4        if(n==2) return true;
5        if(n%2==0) return false;
6        for(int i=3; i*i<=n; i++) {
7            if(n%i==0) return false;
8        }
9        return true;
10    }
11    public boolean completePrime(int num) {
12        String s = String.valueOf(num);
13        int n = s.length();
14        for(int i=1; i<=n; i++) {
15            long pfx = Long.parseLong(s.substring(0,i));
16            if(!isPrime(pfx)) return false;
17        }
18        for(int i=0; i<n; i++) {
19            long sfx = Long.parseLong(s.substring(i));
20            if(!isPrime(sfx)) return false;
21        }
22        return true;
23        
24    }
25}
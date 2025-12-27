// Last updated: 27/12/2025, 23:18:00
1class Solution {
2    public int minArrivalsToDiscard(int[] a, int w, int m) {
3        int n= a.length;
4        int ans=0;
5        int[] freq =new int[100001];
6        boolean[] keep=new boolean[n];
7        for(int i=0;i<n;i++){
8            if(i>=w && keep[i-w]) freq[a[i-w]]--;
9            if(freq[a[i]]==m) ans++;
10            else{
11                keep[i]=true;
12                freq[a[i]]++;
13            }
14        }
15        return ans;
16    }
17}
// Last updated: 27/01/2026, 14:21:09
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int time = 0;
4        while(true) {
5            for(int i=0; i<tickets.length; i++) {
6                if(tickets[i]==0) continue;
7                time++;
8                if(tickets[i]-1==0) {
9                    if(i==k) return time;
10                }
11                tickets[i]=tickets[i]-1;
12            }
13        }
14    }
15}
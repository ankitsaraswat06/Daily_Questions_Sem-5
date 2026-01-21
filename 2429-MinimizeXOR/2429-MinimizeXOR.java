// Last updated: 21/01/2026, 12:35:34
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        int setBit = 0;
4        while(num2>0) {
5            num2 = (num2 & (num2-1));
6            setBit++;
7        }
8        int x=0;
9        for(int i=30; i>=0; i--) {
10            int mask = (1<<i);
11            if((num1& mask)!=0) {
12                x = x | mask;
13                setBit--;
14                if(setBit==0) {
15                    return x;
16                }
17            }
18        }
19
20        for(int i=0; i<=30; i++) {
21            int mask = (1<<i);
22            if((num1& mask)==0) {
23                x = x | mask;
24                setBit--;
25                if(setBit==0) {
26                    return x;
27                }
28            }
29        } 
30
31        return x;
32        
33    }
34}
// Last updated: 25/12/2025, 12:39:18
1class Solution {
2    public int distMoney(int money, int children) {
3        if (money < children) return -1;
4
5        money -= children; 
6        int ans = Math.min(money / 7, children);
7        if (ans == children && money != 7 * children) return children - 1;
8
9        if (ans < children && money - ans * 7 == 3 && ans == children - 1)
10            ans--;
11
12        return ans;
13
14        
15        
16    }
17}
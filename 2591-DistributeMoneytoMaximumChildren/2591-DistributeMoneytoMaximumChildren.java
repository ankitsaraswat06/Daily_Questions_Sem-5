// Last updated: 25/12/2025, 17:37:12
1class Solution {
2    public int distMoney(int money, int children) {
3        if (money < children) return -1;
4
5        int canGive = money/8;
6        if(canGive>children) return children-1;
7
8        while(canGive>0 && (money-canGive*8)<children-canGive) canGive--;
9
10        int remain = children-canGive;
11        if((money-canGive*8)==4 && remain==1) canGive--;
12        else if((money-canGive*8)>0 && remain==0) canGive--;
13        return canGive;
14
15        
16        
17    }
18}
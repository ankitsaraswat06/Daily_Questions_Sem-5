// Last updated: 24/12/2025, 12:21:38
1class Solution {
2    public int minimumBoxes(int[] apple, int[] capacity) {
3        Arrays.sort(capacity);
4        int sum = 0;
5        for(int ap: apple) sum+=ap;
6        int c =0;
7        for(int i=capacity.length-1; i>=0; i--) {
8            sum = sum-capacity[i];
9            c++;
10            if(sum<=0) break;
11        }
12        return c;
13        
14    }
15}
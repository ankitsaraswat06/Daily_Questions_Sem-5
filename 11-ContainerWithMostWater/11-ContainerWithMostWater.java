// Last updated: 19/12/2025, 10:36:38
1class Solution {
2    public int maxArea(int[] height) {
3        int i=0;
4        int j = height.length-1;
5        int ans = 0;
6        while(i<j) {
7            ans = Math.max(Math.min(height[i], height[j]) * (j-i), ans);
8            if(height[i]<height[j]) i++;
9            else j--;
10        }
11        
12        return ans;
13    }
14}
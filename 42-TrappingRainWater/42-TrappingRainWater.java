// Last updated: 10/12/2025, 21:17:30
1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int[] rightMax = new int[n];
5        rightMax[n-1] = height[n-1];
6        for(int i=n-2; i>=0; i--) {
7            rightMax[i] = Math.max(rightMax[i+1], height[i]);
8        }
9        int total = 0;
10        int leftMax = Integer.MIN_VALUE;
11        for(int i=0; i<n; i++) {
12            leftMax = Math.max(leftMax, height[i]);
13            total += Math.min(leftMax, rightMax[i])-height[i];
14            
15        }
16        return total;
17    }
18}
// Last updated: 15/11/2025, 13:42:41
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<j) {
            max = Math.max(Math.min(height[i], height[j]) * (j-i), max);
            if(height[i] < height[j]) i++;
            else j--;

        }
        return max;
    }
}
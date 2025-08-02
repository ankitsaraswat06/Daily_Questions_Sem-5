// Last updated: 02/08/2025, 18:59:59
class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int curr;

        int Max = Integer.MIN_VALUE;

        while(start<end) {
            curr = (end-start) * Math.min(height[start], height[end]);

            if(curr >Max) {
                Max = curr;
            }
            if(height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
            
        }

        return Max;
        
    }
}
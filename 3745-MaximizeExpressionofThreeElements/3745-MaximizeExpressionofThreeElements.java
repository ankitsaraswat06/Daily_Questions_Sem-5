// Last updated: 16/11/2025, 11:45:15
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int el: nums) {
            if(el>max) {
                sMax = max;
                max = el;
            } else if(el>sMax) {
                sMax = el;
            } 

            if(el<min) {
                min =el;
            }
        }
        return max+sMax-min;
        
    }
}
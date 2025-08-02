// Last updated: 02/08/2025, 15:28:17
class Solution {
    public int maxSum(int[] nums) {
        boolean containNN = false;
        int positionSum = 0;
        Set<Integer> posSet = new HashSet<>();
        int maxNegative = -101;
        for(int x: nums) {
            if(x>=0) {
                containNN = true;
                if(x>0) {
                    posSet.add(x);
                }
            } else {
                maxNegative = Math.max(maxNegative, x);
            }
        }
        if(containNN) {
            for(int x: posSet) {
                positionSum+=x;
            }
            return positionSum;
        }
        return maxNegative;
    }
}
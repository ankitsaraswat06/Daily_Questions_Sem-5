// Last updated: 08/11/2025, 20:02:14
class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int el: nums) max = Math.max(max, el);
        int sum=0;
        for(int el: nums) sum+=(max-el);
        return sum;
        
    }
}
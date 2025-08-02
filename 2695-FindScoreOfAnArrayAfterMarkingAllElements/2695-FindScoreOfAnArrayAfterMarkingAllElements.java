// Last updated: 02/08/2025, 18:52:34
class Solution {
    public long findScore(int[] nums) {
        boolean[] marked = new boolean[nums.length];
        int[][] pairs = new int[nums.length][2];
        for(int i=0; i<nums.length; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a,b) -> Integer.compare(a[0], b[0]));
        long score = 0;
        for(int i=0; i<nums.length; i++) {
            if(!marked[pairs[i][1]]) {
                score+=pairs[i][0];
                marked[pairs[i][1]] = true;
                if(pairs[i][1] - 1 >= 0) marked[pairs[i][1] - 1] =true;
                if(pairs[i][1] + 1 < nums.length) marked[pairs[i][1] + 1] = true;    
            }
            
        }  
        return score; 
    }
}
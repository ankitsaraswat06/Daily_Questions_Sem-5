// Last updated: 02/08/2025, 18:58:23
class Solution {
    public int candy(int[] ratings) {
        int sum =0;
        int ans[] = new int[ratings.length];
        for(int i=0; i<ratings.length; i++) {
            ans[i] = 1;
        }
        for(int i=1; i<ratings.length; i++) {
            if(ratings[i-1] < ratings[i]) {
                ans[i] = ans[i-1] + 1;
            }
        }
        for(int i=ratings.length-2; i>=0; i--) {
            if(ratings[i] > ratings[i+1]) {
                ans[i] = Math.max(ans[i], ans[i+1]+1);
            }
        }
        for(int i=0; i<ans.length; i++) {
            sum+=ans[i];
        }
        return sum;
        
    }
}
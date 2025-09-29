// Last updated: 29/09/2025, 12:11:54
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++) {
            int j= 0;
            int k = image[0].length-1;
            while(j<=k) {
                if(j==k) {
                    image[i][j]^=1;
                    break;
                }
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][k] ^ 1;
                image[i][k] = temp;
                j++;
                k--;
            }
        }
        
        return image;
    }
}
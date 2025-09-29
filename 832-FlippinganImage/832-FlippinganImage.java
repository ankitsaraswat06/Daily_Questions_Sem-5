// Last updated: 29/09/2025, 12:08:16
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++) {
            int j= 0;
            int k = image[0].length-1;
            while(j<k) {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j++;
                k--;
            }
        }
        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image[0].length; j++) {
                if(image[i][j]==0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        return image;
    }
}
// Last updated: 02/08/2025, 18:56:12
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k = flowerbed.length;
      for(int i=0; i<k; i++) {
        if(flowerbed[i]==0) {
            if((i-1<0 || flowerbed[i-1]==0) && (i+1 >=k  || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
        }
      }  
      return n<=0;
    }
}
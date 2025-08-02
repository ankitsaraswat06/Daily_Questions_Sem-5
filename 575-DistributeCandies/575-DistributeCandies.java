// Last updated: 02/08/2025, 18:56:13
class Solution {
    public int distributeCandies(int[] candyType) {

        Arrays.sort(candyType);

        int different = 0;
        int count = 0;
        for(int i =1; i<candyType.length; i++) {
            if(candyType[i] == candyType[i-1]) {
                continue;
            } else if(candyType[i]!=candyType[i-1] && count<candyType.length/2)  {
                different++;
                count++;
            }
        }

        if(count<candyType.length/2) {
            different++;
        }

        return different;
        

        
        
    }
 }
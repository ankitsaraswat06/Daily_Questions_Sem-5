// Last updated: 02/08/2025, 18:57:24
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        for(int i=0; i<citations.length; i++) {
            int h = citations.length-i;
            if(citations[i] >= h ) {
                hIndex = h;
                break;
            }
            
        }

        return hIndex;
        
    }
}
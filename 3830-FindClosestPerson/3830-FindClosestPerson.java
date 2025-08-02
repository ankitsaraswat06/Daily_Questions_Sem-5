// Last updated: 02/08/2025, 15:28:10
class Solution {
    public int findClosest(int x, int y, int z) {
        int xRange = Math.abs(z-x);
        int yRange = Math.abs(z-y);

        
        if(yRange>xRange) {
            return 1;
        }
        if(xRange>yRange) {
            return 2;
        }
        return 0;
    }
}
// Last updated: 01/10/2025, 11:01:12
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)->Integer.compare(a[1], b[1]));
        long end = points[0][1];
        long arrows = 1;
        for(int i=1; i<points.length; i++) {
            if(points[i][0] > end) {
                end = points[i][1];
                arrows++;
            }
        }
        return (int)arrows;
        
    }
}
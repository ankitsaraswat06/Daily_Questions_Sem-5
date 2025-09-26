// Last updated: 26/09/2025, 21:34:40
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b)-> Integer.compare(a[1], b[1]));
        int end = points[0][1];
        int c = 1;
        for(int i=1; i<points.length; i++) {
            if(points[i][0] > end) {
                end = points[i][1];
                c++;
            }
        }
        return c;
    }
}
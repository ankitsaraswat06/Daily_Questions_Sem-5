// Last updated: 27/08/2025, 15:35:50
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        double maxD = 0;
        for(int i=0; i<dimensions.length; i++) {
            int l = dimensions[i][0];
            int b = dimensions[i][1];
            double diag =  Math.sqrt(l*l + b*b);
            int currArea = l*b;
            if(diag>maxD) {
                maxD = diag;
                area = currArea;
            } else if(diag==maxD && currArea>area) {
                area = currArea;
            }
        }
        return area;
        
    }
}
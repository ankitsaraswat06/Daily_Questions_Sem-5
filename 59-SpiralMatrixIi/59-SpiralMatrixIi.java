// Last updated: 02/08/2025, 18:59:00
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int minC = 0, minR = 0, maxC = arr[0].length-1, maxR = arr.length-1;
        int te = n*n;
        int c =1;
        // int num = 1;
        while(c<=te) {
            for(int i=minC; i<=maxC && c<=te; i++) {
                arr[minR][i] = c;   
                c++;
            }
            minR++;
    
            for(int i=minR; i<=maxR && c<=te; i++) {
                arr[i][maxC] = c;
                c++;
            }
            maxC--;
    
            for(int i = maxC; i>= minC && c<=te; i--) {
                arr[maxR][i] = c;
                c++;
            }
            maxR--;
    
            for(int i = maxR; i>=minR && c<=te; i--) {
                arr[i][minC] = c;
                c++;
            }
            minC++;

        }

        return arr;
        
    }
}
// Last updated: 02/08/2025, 18:56:00
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        return answer(grid);
    }
    public static int answer(int[][] arr){
        int n = arr.length;
        int m  = arr[0].length;
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    max = Math.max(max,maxArea(i,j,arr));
                }
            }
        }
        return max;
    }
    public static int maxArea(int row,int col,int[][] arr){
        if(col<0 || row<0 || row>=arr.length || col>=arr[0].length || arr[row][col] != 1){
            return 0;
        }
        arr[row][col] =0;
        int left = maxArea(row,col-1,arr);
        int up = maxArea(row-1,col,arr);
        int right = maxArea(row,col+1,arr);
        int down = maxArea(row+1,col,arr);

        return left+up+right+down+1;
    }
}
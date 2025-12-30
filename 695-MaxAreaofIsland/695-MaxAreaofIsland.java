// Last updated: 30/12/2025, 11:57:32
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        return answer(grid);
4    }
5    public static int answer(int[][] arr){
6        int n = arr.length;
7        int m  = arr[0].length;
8        int max = 0;
9        for(int i=0;i<n;i++){
10            for(int j=0;j<m;j++){
11                if(arr[i][j]==1){
12                    max = Math.max(max,maxArea(i,j,arr));
13                }
14            }
15        }
16        return max;
17    }
18    public static int maxArea(int row,int col,int[][] arr){
19        if(col<0 || row<0 || row>=arr.length || col>=arr[0].length || arr[row][col] != 1){
20            return 0;
21        }
22        arr[row][col] =0;
23        int left = maxArea(row,col-1,arr);
24        int up = maxArea(row-1,col,arr);
25        int right = maxArea(row,col+1,arr);
26        int down = maxArea(row+1,col,arr);
27
28        return left+up+right+down+1;
29    }
30}
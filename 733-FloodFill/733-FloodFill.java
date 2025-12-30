// Last updated: 30/12/2025, 11:11:25
1class Solution {
2    public void rec(int[][] image, int sr, int sc, int startC,  int color) {
3
4        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length ||  image[sr][sc] != startC || image[sr][sc]==color) return;
5            
6        image[sr][sc] = color;
7
8        rec(image, sr-1, sc, startC, color);
9        rec(image, sr+1, sc, startC, color);
10        rec(image, sr, sc+1, startC, color);
11        rec(image, sr, sc-1, startC, color);
12        
13    }
14    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
15        
16        int startC = image[sr][sc];
17        rec(image, sr, sc, startC, color);
18        return image;
19        
20    }
21}
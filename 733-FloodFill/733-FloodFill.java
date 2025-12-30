// Last updated: 30/12/2025, 11:12:02
1class Solution {
2    public void dfs(int[][] image, int sr, int sc, int startC,  int color) {
3
4        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length ||  image[sr][sc] != startC || image[sr][sc]==color) return;
5            
6        image[sr][sc] = color;
7
8        dfs(image, sr-1, sc, startC, color);
9        dfs(image, sr+1, sc, startC, color);
10        dfs(image, sr, sc+1, startC, color);
11        dfs(image, sr, sc-1, startC, color);
12        
13    }
14    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
15        
16        int startC = image[sr][sc];
17        dfs(image, sr, sc, startC, color);
18        return image;
19        
20    }
21}
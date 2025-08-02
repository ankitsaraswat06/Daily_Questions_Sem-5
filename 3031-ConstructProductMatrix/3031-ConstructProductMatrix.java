// Last updated: 02/08/2025, 18:52:21
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
      

        int[] arr=new int[grid.length*grid[0].length];

        int[] left =new int[grid.length*grid[0].length];
        int[] right= new int[grid.length*grid[0].length];

        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               arr[k++]=grid[i][j]%12345;
            }
        }

        // prefix 
        left[0]=1;
        for(int i=1;i<left.length;i++){
            left[i]=(left[i-1]%12345*arr[i-1]%12345)%12345;
        }

        // suffix
        right[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            right[i]=(right[i+1]%12345*arr[i+1]%12345)%12345;
        }
       
        int idx=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               grid[i][j]=(left[idx]%12345*right[idx]%12345)%12345;
               idx++;
            }
        }

        return grid;

    }
}
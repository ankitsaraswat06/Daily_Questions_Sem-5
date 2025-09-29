// Last updated: 29/09/2025, 14:24:53
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ll = new ArrayList<>();
        int min[] = new int[matrix.length];
        for(int i=0; i<matrix.length; i++) {
            int rMin = matrix[i][0];
            for(int j=1; j<matrix[0].length;j++) {
                rMin = Math.min(matrix[i][j], rMin);
            }
            min[i] = rMin;
        }
        int max[] = new int[matrix[0].length];
        for(int j=0; j<matrix[0].length; j++) {
            int cMax = matrix[0][j];
            for(int i=0; i<matrix.length; i++) {
                cMax = Math.max(matrix[i][j], cMax);
            }
            max[j] = cMax;
        }

        int ans = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == min[i] && matrix[i][j] == max[j]) ll.add(matrix[i][j]);
            }
        }
        return ll;

    }
}
// Last updated: 23/11/2025, 21:59:22
class Solution {
    public int nCr(int n, int r) {
        long res = 1;
        for(int i=0; i<r; i++) {
            res = res * (n-i);
            res = res/ (i+1);
        }
        return (int) res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<numRows; i++) {
            List<Integer> ll = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                ll.add(nCr(i,j));
            }
            ans.add(ll);  
        }
        return ans;
        
        
    }
}
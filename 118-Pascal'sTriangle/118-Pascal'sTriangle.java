// Last updated: 23/11/2025, 22:08:11
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1; i<=numRows; i++) {
            List<Integer> ll = new ArrayList<>();
            int res = 1;
            ll.add(res);
            for(int j=1; j<i; j++) {
                res = res * (i-j);
                res = res / j;
                ll.add(res);
            } 
            ans.add(ll);
        }
        return ans;
        
        
    }
}
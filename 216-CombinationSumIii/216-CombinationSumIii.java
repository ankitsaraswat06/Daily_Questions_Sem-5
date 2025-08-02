// Last updated: 02/08/2025, 18:57:46
class Solution {
    public void print(int k, int n, int curr, ArrayList<Integer> ll, List<List<Integer>> ans ) {
        if(n==0 && k == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=curr; i<=9; i++) {
            if(i>n) break;
            if(n-i>=0 && k-1>=0) {
                ll.add(i);
                print(k-1, n-i, i+1, ll, ans );
                ll.remove(ll.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        print(k, n, 1, new ArrayList<Integer>(), ans);
        return ans;  
    }
}
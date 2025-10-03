// Last updated: 03/10/2025, 20:38:15
class Solution {
    public static void rec(int n, int k, List<Integer> ll, List<List<Integer>> ans) {
        if(n==0) {
            if(ll.size()==k) ans.add(new ArrayList<>(ll));
            return; 
        }
        // pick
        ll.add(n);
        rec(n-1, k, ll, ans);
        ll.remove(ll.size()-1);
        //not pick
        rec(n-1, k, ll, ans);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        rec(n, k, ll, ans);

        return ans;
    }
}
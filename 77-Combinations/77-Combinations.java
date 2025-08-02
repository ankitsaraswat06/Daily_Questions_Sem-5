// Last updated: 02/08/2025, 18:58:53
class Solution {
    public void print(int n, int k, int curr, ArrayList<Integer> ll, List<List<Integer>> ans) {
        if(k==0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i = curr; i<=n; i++) {
            ll.add(i);
            print(n, k-1, i+1, ll, ans);
            ll.remove(ll.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        print(n, k, 1, new ArrayList<Integer>(), ans);
        return ans;
    }
}
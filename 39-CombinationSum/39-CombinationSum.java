// Last updated: 02/08/2025, 18:59:24
class Solution {
    public void sum(int[] candidates, int target, List<Integer> ll, List<List<Integer>> ans, int idx) {
        if(target == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx; i<candidates.length; i++) {
            if(target>=candidates[i]) {
                ll.add(candidates[i]);
                sum(candidates, target-candidates[i], ll, ans, i);
                ll.remove(ll.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        sum(candidates, target, ll, ans,0);
        return ans;
    }
}
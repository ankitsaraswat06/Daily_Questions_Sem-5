// Last updated: 19/12/2025, 10:57:04
1class Solution {
2    public void rec(int[] candidates, int target, int idx, List<Integer> ll, List<List<Integer>> ans) {
3        if(target==0) {
4            ans.add(new ArrayList<>(ll));
5            return;
6        }
7        for(int i=idx; i<candidates.length; i++) {
8            if(target-candidates[i] >= 0) {
9                ll.add(candidates[i]);
10                rec(candidates, target-candidates[i], i, ll, ans);
11                ll.remove(ll.size()-1);
12            }
13        }
14    }
15    public List<List<Integer>> combinationSum(int[] candidates, int target) {
16        List<List<Integer>> ans = new ArrayList<>();
17        List<Integer> ll = new ArrayList<>();
18        rec(candidates, target, 0, ll, ans);
19        return ans;        
20    }
21}
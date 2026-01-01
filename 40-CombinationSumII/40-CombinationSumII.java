// Last updated: 01/01/2026, 12:03:29
1class Solution {
2    public void rec(int[] candidates, int target, int idx, List<List<Integer>> ans, List<Integer> ll) {
3        
4        if(target==0) {
5            ans.add(new ArrayList<>(ll));
6            return;
7        }
8        if(idx>=candidates.length) return;
9        for(int i=idx; i<candidates.length; i++) {
10            if(i>idx && candidates[i] == candidates[i-1]) continue;
11            if(target-candidates[i]>=0) {
12                ll.add(candidates[i]);
13                rec(candidates, target-candidates[i], i+1, ans, ll);
14                ll.remove(ll.size()-1);
15            }
16        }
17    }
18    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
19        List<List<Integer>> ans = new ArrayList<>();
20        List<Integer> ll = new ArrayList<>();
21        Arrays.sort(candidates);
22        rec(candidates, target, 0, ans, ll);
23        return ans;
24        
25    }
26}
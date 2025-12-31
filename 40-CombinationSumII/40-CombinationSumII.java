// Last updated: 31/12/2025, 22:47:56
1class Solution {
2    public static void cS(int idx, int[] arr, int target, ArrayList<Integer> ll, List<List<Integer>> ans ) {
3        if(target == 0) {
4            ans.add(new ArrayList<>(ll));
5            return;
6        }
7        for(int i=idx; i<arr.length; i++) {
8            if(i>idx && arr[i] == arr[i-1]) continue;
9            if(arr[i]>target) break;
10            ll.add(arr[i]);
11            cS(i+1, arr, target-arr[i], ll, ans);
12            ll.remove(ll.size()-1);
13        }
14    }
15    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
16        Arrays.sort(candidates);
17        List<List<Integer>> ans = new ArrayList<>();
18        cS(0, candidates, target, new ArrayList<Integer>(), ans);
19        return ans;
20    }
21}
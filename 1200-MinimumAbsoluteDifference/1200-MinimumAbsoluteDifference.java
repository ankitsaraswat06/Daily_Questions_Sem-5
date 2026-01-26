// Last updated: 26/01/2026, 14:15:26
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4        List<List<Integer>> ans = new ArrayList<>();
5        int min = Integer.MAX_VALUE;
6        for(int i=1; i<arr.length; i++) 
7        {
8            if(arr[i]-arr[i-1] < min) {
9                min = arr[i]-arr[i-1];
10            }
11        }
12        for(int i=1; i<arr.length; i++) {
13            if(arr[i]-arr[i-1]==min) {
14                List<Integer> ll = new ArrayList<>();
15                ll.add(arr[i-1]);
16                ll.add(arr[i]);
17                ans.add(ll);
18            }
19        }
20        return ans;
21    }
22}
// Last updated: 15/01/2026, 20:35:46
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        int n = nums.length; 
4        List<Integer> list = new ArrayList<>();
5        for(int i=0; i<n; i++){
6            if(s.charAt(i) == '1'){
7                list.add(i);
8            }
9        }
10        if(list.size() == 0) return 0;
11        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
12        int idx = 0; long ans = 0;
13        for(int i=0; i<n; i++){
14            pq.add(nums[i]);
15            if(i == list.get(idx)){
16                ans += pq.poll();
17                idx++;
18            }
19            if(idx == list.size()){
20                break;
21            }
22        }
23        return ans;
24    }
25}
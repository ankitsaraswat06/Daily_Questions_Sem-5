// Last updated: 29/01/2026, 12:15:00
1class Solution {
2    public int findMaxLength(int[] nums) {
3        int sum = 0;
4        int max = 0;
5        HashMap<Integer, Integer> map =new HashMap<>();
6        map.put(0, -1);
7        for(int i=0; i<nums.length; i++) {
8            sum+=nums[i]==0?-1:1;
9            if(map.containsKey(sum)) {
10                max = Math.max(max, i-map.get(sum));
11            } else {
12                map.put(sum, i);
13            }
14        }
15        return max;
16        
17    }
18}
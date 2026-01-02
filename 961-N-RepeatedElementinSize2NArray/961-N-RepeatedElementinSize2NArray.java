// Last updated: 02/01/2026, 11:37:02
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        int n = nums.length/2;
5        for(int el: nums) {
6            map.put(el, map.getOrDefault(el, 0)+1);
7        }
8        for(int key: map.keySet()) {
9            if(map.get(key)==n) return key;
10        }
11        return 0;
12        
13    }
14}
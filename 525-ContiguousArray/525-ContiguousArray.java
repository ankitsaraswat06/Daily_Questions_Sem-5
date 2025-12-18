// Last updated: 18/12/2025, 15:06:41
1class Solution {
2    public int findMaxLength(int[] arr) {
3        int sum = 0;
4        int maxLen = 0;
5        HashMap<Integer, Integer> map = new HashMap<>();
6        map.put(0,-1);
7        for(int i=0; i<arr.length; i++) {
8            sum+=arr[i]==0?-1:1;
9            if(map.containsKey(sum)) {
10                maxLen = Math.max(maxLen, i-map.get(sum));
11            } else {
12                map.put(sum, i);
13            }
14        }
15        return maxLen;
16    }
17}
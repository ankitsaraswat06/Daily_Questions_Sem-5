// Last updated: 18/12/2025, 14:30:20
1class Solution {
2    public int findMaxLength(int[] arr) {
3        int sum = 0;
4        int maxLen = 0;
5        HashMap<Integer, Integer> map = new HashMap<>();
6        for(int i=0; i<arr.length; i++) {
7            sum+=arr[i]==0?-1:1;
8
9            if(sum==0) {
10                maxLen = Math.max(maxLen, i+1);
11            }
12            if(map.containsKey(sum)) {
13                maxLen = Math.max(maxLen, i-map.get(sum));
14            } else {
15                map.put(sum, i);
16            }
17        }
18        return maxLen;
19    }
20}
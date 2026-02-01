// Last updated: 01/02/2026, 18:21:28
1class Solution {
2    public int[] findOriginalArray(int[] changed) {
3        int n = changed.length;
4        if(n%2!=0) return new int[0];
5        Arrays.sort(changed);
6        Map<Integer, Integer> map = new HashMap<>();
7        for(int i=0; i<n; i++) {
8            map.put(changed[i], map.getOrDefault(changed[i], 0)+1);
9        }
10        List<Integer> ll = new ArrayList<>();
11        
12        for(int k: changed) {
13            if(map.get(k)==0) continue;
14            if(map.getOrDefault(k*2, 0)==0) return new int[0];
15            ll.add(k);
16            map.put(k, map.get(k)-1);
17            map.put(k*2, map.get(k*2)-1);
18        }
19        int arr[] = new int[n/2];
20        int idx = 0;
21        while(ll.size()>0) {
22            arr[idx++] = ll.remove(0);
23        }
24        return arr;
25    }
26}
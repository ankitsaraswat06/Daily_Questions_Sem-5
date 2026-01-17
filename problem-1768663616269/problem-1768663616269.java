// Last updated: 17/01/2026, 20:56:56
1class Solution {
2    int MOD = 1000000007;
3    public int alternatingXOR(int[] nums, int target1, int target2) {
4        Map<Integer, Long> map1 = new HashMap<>();
5        Map<Integer, Long> map2 = new HashMap<>();
6
7        long[] way1 = new long[nums.length+1];
8        long[] way2 = new long[nums.length+1];
9
10        int preXor = 0;
11        map2.put(0, 1L);
12        for(int idx=1; idx<=nums.length; idx++) {
13            preXor = preXor^nums[idx-1];
14            way1[idx] = map2.getOrDefault(preXor^target1, 0L);
15            way2[idx] = map1.getOrDefault(preXor^target2, 0L);
16            way1[idx]%=MOD;
17            way2[idx]%=MOD;
18
19            map1.put(preXor, (map1.getOrDefault(preXor, 0L)+way1[idx])%MOD);
20            map2.put(preXor, (map2.getOrDefault(preXor, 0L)+way2[idx])%MOD);
21            
22        }
23        return (int)((way1[nums.length] + way2[nums.length])%MOD);
24        
25    }
26}
// Last updated: 25/12/2025, 18:19:59
1class Solution {
2    int MOD = 1000000007;
3    public int rev(int n) {
4        int rev = 0;
5        while(n>0) {
6            rev = rev*10 + n%10;
7            n/=10;
8        }
9        return rev;
10    }
11    public int countNicePairs(int[] nums) {
12        Map<Integer, Integer> map = new HashMap<>();
13        int count = 0;
14        for(int i=0; i<nums.length; i++) {
15            int val = nums[i]- rev(nums[i]);
16            if(map.containsKey(val)) {
17                count = (count%MOD+map.get(val)%MOD)%MOD;
18            }
19            map.put(val, map.getOrDefault(val,0)+1);
20        }
21        return count;
22    }
23}
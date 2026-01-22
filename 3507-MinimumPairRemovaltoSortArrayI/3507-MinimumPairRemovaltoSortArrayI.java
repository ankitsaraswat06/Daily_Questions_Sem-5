// Last updated: 22/01/2026, 23:10:05
1class Solution {
2    public boolean isNonDec(List<Integer> nums) {
3        for(int i=1; i<nums.size(); i++) {
4            if(nums.get(i) < nums.get(i-1)) return false;
5        }
6        return true;
7    }
8    public int minimumPairRemoval(int[] nums) {
9        List<Integer> ll = new ArrayList<>();
10        for(int num: nums) ll.add(num);
11        int count = 0;
12        while(!isNonDec(ll)) {
13            int minSum = Integer.MAX_VALUE;
14            int minIdx = -1;
15            for(int i=0; i<ll.size()-1; i++) {
16                if(ll.get(i) + ll.get(i+1) < minSum)  {
17                    minSum = ll.get(i) + ll.get(i+1);
18                    minIdx = i;
19                }
20            }
21            ll.set(minIdx, minSum);
22            ll.remove(minIdx+1);
23            count++;
24        }
25        return count;
26    }
27}
// Last updated: 20/12/2025, 11:13:44
1class Solution {
2    public boolean isPossible(int[] nums) {
3        Map<Integer, Integer> freqMap = new HashMap<>();
4        Map<Integer, Integer> hypoMap = new HashMap<>();
5
6        for(int i: nums) {
7            freqMap.put(i, freqMap.getOrDefault(i, 0)+1);
8        }
9
10        for(int i: nums) {
11            if(freqMap.get(i)==0) {
12                continue;
13            }
14            if(hypoMap.getOrDefault(i,0)>0) {
15                hypoMap.put(i, hypoMap.get(i)-1);
16                hypoMap.put(i+1, hypoMap.getOrDefault(i+1, 0)+1);
17                freqMap.put(i, freqMap.get(i)-1);
18            } else if(freqMap.getOrDefault(i,0)>0 && freqMap.getOrDefault(i+1,0)>0 && freqMap.getOrDefault(i+2,0)>0) {
19                freqMap.put(i, freqMap.get(i)-1);
20                freqMap.put(i+1, freqMap.get(i+1)-1);
21                freqMap.put(i+2, freqMap.get(i+2)-1);
22                hypoMap.put(i+3, hypoMap.getOrDefault(i+3,0)+1);
23            } else {
24                return false;
25            }
26        }
27        return true;
28
29        
30    }
31}
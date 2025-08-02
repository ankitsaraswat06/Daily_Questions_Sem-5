// Last updated: 02/08/2025, 18:52:58
class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            if(num%2==0) {
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        int maxFreq = 0;
        int minKey = -1;

        for(int key : map.keySet()) {
            int freq = map.get(key);
            if(freq > maxFreq || (freq == maxFreq && key < minKey)) {
                maxFreq = freq;
                minKey = key;
            }
        }
        return minKey;
        
    }
}
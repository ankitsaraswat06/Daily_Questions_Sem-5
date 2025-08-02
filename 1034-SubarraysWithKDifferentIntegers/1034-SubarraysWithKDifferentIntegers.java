// Last updated: 02/08/2025, 18:55:06
class Solution {
    public int withAtmostKDistinct(int [] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int si =0, count=0;
        for(int ei=0; ei<nums.length; ei++) {
            freqMap.put(nums[ei], freqMap.getOrDefault(nums[ei], 0) + 1);
            // shrink
            while(freqMap.size() > k) {
                freqMap.put(nums[si], freqMap.get(nums[si]) - 1);
                if(freqMap.get(nums[si]) == 0) {
                    freqMap.remove(nums[si]);
                }
                si++;
            }
            //update ans

            count += ei-si+1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return withAtmostKDistinct(nums, k) - withAtmostKDistinct(nums, k-1);
           
    }
}
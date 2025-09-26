// Last updated: 26/09/2025, 11:51:27
class Solution {
    public int majorityElement(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
            if(map.get(i)>=(nums.length/2+1)) {
                return i;
            }
        }
        return -1;
    }
}
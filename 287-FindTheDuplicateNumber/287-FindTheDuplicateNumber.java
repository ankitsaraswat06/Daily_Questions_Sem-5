// Last updated: 02/08/2025, 18:57:19
class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) return nums[i];
            map.put(nums[i], 1);
        }
        return -1;
        
    }
}
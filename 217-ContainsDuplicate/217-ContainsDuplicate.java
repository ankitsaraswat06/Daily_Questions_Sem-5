// Last updated: 02/08/2025, 18:57:44
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.getOrDefault(nums[i],0) == 1) return true;
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }  
        return false;
    }
}
// Last updated: 02/08/2025, 18:56:40
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<>();
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                lst.add(nums[i]);
            }
        } 
        return lst;
    }
}
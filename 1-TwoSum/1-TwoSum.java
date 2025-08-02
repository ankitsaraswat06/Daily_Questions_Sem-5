// Last updated: 02/08/2025, 19:00:08
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int required = target - nums[i];
            if(map.containsKey(required)) {
                ans[0] = map.get(required);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
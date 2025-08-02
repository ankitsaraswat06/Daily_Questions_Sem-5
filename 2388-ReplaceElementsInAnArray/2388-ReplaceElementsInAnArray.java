// Last updated: 02/08/2025, 18:53:08
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i=0; i<operations.length; i++) {
            int oldVal = operations[i][0];
            int newVal = operations[i][1];
            int idx = map.get(oldVal);
            nums[idx] = newVal;
            map.remove(oldVal);
            map.put(newVal, idx);
        }

        return nums;
         
    }
}
// Last updated: 02/08/2025, 18:57:09
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++) {
            int max = Integer.MIN_VALUE;
            int maxEl = 0;
            for(int key: map.keySet()) {
                if(map.get(key) > max) {
                    maxEl = key;
                    max = map.get(key);
                }
            }
            ans[i] = maxEl;
            map.remove(maxEl);
        }
        return ans;
    }
}
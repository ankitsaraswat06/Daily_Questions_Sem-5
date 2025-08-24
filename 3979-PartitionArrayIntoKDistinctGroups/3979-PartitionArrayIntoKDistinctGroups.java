// Last updated: 24/08/2025, 11:11:46
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if(nums.length%k!=0) return false;
        int maxR = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1 );
        }
        for(int i: map.keySet()) {
            if(map.get(i) > maxR) maxR = map.get(i);
        }
        return maxR<= (nums.length/k) ? true: false;
        
    }
}
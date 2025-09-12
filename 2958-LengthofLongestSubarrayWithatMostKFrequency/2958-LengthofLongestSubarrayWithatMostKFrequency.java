// Last updated: 12/09/2025, 14:52:11
class Solution {
    public boolean isValid(HashMap<Integer, Integer> map, int k) {
        for(int i: map.keySet()){
            if(map.get(i) > k) return false;
        }
        return true;
    }
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0, ans =0, j=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j<nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            
            while(map.get(nums[j]) > k) {
                map.put(nums[i], map.get(nums[i]) -1 );
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
            
        }
        return ans;
    }
}
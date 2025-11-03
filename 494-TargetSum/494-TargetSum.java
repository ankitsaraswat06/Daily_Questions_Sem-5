// Last updated: 03/11/2025, 20:39:17
class Solution {
    public int ways(int[] nums, int target, int curr, int idx, HashMap<String, Integer> memo) {
        if(idx==nums.length) return curr==target?1: 0;
        String key = idx + "," + curr;
        if(memo.containsKey(key)) return memo.get(key);
        int pos = ways(nums, target, curr+nums[idx], idx+1, memo);
        int neg = ways(nums, target, curr-nums[idx], idx+1, memo);
        memo.put(key, pos+neg);
        return pos+neg;
    }
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> memo = new HashMap<>();
        return ways(nums, target, 0, 0, memo);
        
    }
}
// Last updated: 23/11/2025, 08:21:44
class Solution {
    public int maxBalancedSubarray(int[] nums) {
        int prefixXOR = 0;
        int prefixBal = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("0%0", -1);
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            prefixXOR ^=nums[i];
            if(nums[i]%2==0) prefixBal++;
            else prefixBal--;
            String comb = prefixXOR +"%" + prefixBal;
            if(map.containsKey(comb)) {
                int firstIdx = map.get(comb);
                int len = i - firstIdx;
                ans = Math.max(ans, len);
            } else {
                map.put(comb, i);
            }
        }
        return ans;
        
    }
}
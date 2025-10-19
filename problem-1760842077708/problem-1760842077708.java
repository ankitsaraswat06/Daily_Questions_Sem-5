// Last updated: 19/10/2025, 08:17:57
class Solution {
    // public boolean isBalanced(int[] nums, int i, int j) {
    //     TreeMap<Integer, Integer> map = new TreeMap<>();
    //     for(int idx = i; idx<=j; idx++) {
    //         map.put(nums[idx], map.getOrDefault(nums[idx], 0)+1);
    //     }
    //     int even = 0, odd = 0;
    //     for(int k: map.keySet()) {
    //         if(k%2==0) even++;
    //         if(k%2!=0) odd++;
    //     }
    //     return even==odd;
    // }
    public int longestBalanced(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
                int even=0, odd=0;
            for(int j=i; j<nums.length; j++) {
                
                map.put(nums[j], map.getOrDefault(nums[j],0)+1);
                if(map.get(nums[j]) == 1) {
                    if(nums[j]%2==0) even++;
                    else odd++;
                }
                if(even==odd) ans = Math.max(ans, j-i+1);
            }
        }
        return ans==Integer.MIN_VALUE?0:ans;
    }
}
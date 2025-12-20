// Last updated: 20/12/2025, 21:03:30
1class Solution {
2    Integer[][][] dp;
3    public int rec(int[] nums, int idx, int chosen, int mod) {
4        if(chosen==3) {
5            return mod==0?0:Integer.MIN_VALUE;
6        }
7        if(idx==nums.length) return Integer.MIN_VALUE;
8        if(dp[idx][chosen][mod]!=null) return dp[idx][chosen][mod];
9        int pick = nums[idx] + rec(nums, idx+1, chosen+1, (mod+nums[idx])%3);
10        int nonpick = rec(nums, idx+1, chosen, mod);
11        return dp[idx][chosen][mod] = Math.max(pick, nonpick);
12    }
13    public int maximumSum(int[] nums) {
14        dp= new Integer[nums.length][4][3];
15        int ans = rec(nums, 0, 0, 0);
16        return ans<0 ? 0: ans;
17        
18    }
19}
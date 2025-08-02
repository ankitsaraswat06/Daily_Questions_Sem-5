// Last updated: 02/08/2025, 18:53:01
class Solution {
    public static int digitSum(int n) {
        int sum = 0;
        while(n>0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int max = -1;
        int f = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int sum = digitSum(nums[i]);
            if(map.containsKey(sum)) {
                max = Math.max(max, map.get(sum) + nums[i]);
                map.put(sum, Math.max(map.get(sum), nums[i]));
            } else {
                map.put(sum, nums[i]);
            }
        } 
        return max;
    }
}
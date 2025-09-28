// Last updated: 28/09/2025, 09:02:31
class Solution {
    public static boolean isValid(int a, int b, int c) {
        if(a+b>c && b+c>a && a+c>b) return true;
        return false;
    }
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=n-1; i>=2; i--) {
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];
            if(isValid(a,b,c)) return a+b+c;
        }
        return 0;
    }
}
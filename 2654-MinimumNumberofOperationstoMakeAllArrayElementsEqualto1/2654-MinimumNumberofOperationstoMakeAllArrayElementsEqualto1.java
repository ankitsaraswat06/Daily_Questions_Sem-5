// Last updated: 12/11/2025, 22:09:01
class Solution {
    public int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==1) c++;
        }
        if(c!=0) return nums.length-c;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            int g = nums[i];
            for(int j=i; j<nums.length; j++) {
                g = gcd(g, nums[j]);
                if(g==1) {
                    min = Math.min(min, j-i+1);
                }
            }
        }
        if(min==Integer.MAX_VALUE) return -1;

        return min-1 + nums.length-1;




        
    }
}
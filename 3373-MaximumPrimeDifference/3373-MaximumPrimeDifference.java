// Last updated: 02/08/2025, 18:52:08
class Solution {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int firstPrime = -1;
        int lastPrime = -1;
        for(int i=0; i<nums.length; i++) {
            if(isPrime(nums[i])) {
                firstPrime = i;
                break;
            }
        }
        for(int i=nums.length-1; i>=0; i--) {
            if(isPrime(nums[i])) {
                lastPrime = i;
                break;
            }
        }
        return lastPrime-firstPrime;
    }
}
// Last updated: 02/08/2025, 15:28:11
class Solution {
    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
    public long sumOfLargestPrimes(String s) {
        Set<Long> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                String str = s.substring(i, j);
                if (str.length() > 12) continue;
                if (str.charAt(0) == '0' && str.length() > 1) continue;
                long num = Long.parseLong(str);
                if(isPrime(num)) set.add(num);
            }
        }
        if(set.size()==0) return 0;
        if(set.size()<3) {
            long sum =0;
            for(long k: set) sum+=k;
            return sum;
        }
        long[] arr = new long[set.size()];
        int idx=0;
        for(long k: set) arr[idx++] = k;
        Arrays.sort(arr);
        return arr[arr.length-1] + arr[arr.length-2] + arr[arr.length-3];
    }
}
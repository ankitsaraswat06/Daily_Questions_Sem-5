// Last updated: 02/08/2025, 18:55:11
class Solution {
    public int subarraysDivByK(int[] arr, int n){
        // int n = arr.length;
        long[] freq= new long[n];
        long sum = 0;
        freq[0] = 1;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            int rem = (int)(sum%n);
            if(rem < 0) {
                rem +=n;// ve;
            }
            freq[rem]++;
        }
        long ans = 0;
        for(int i=0; i<freq.length; i++) {
            if(freq[i] >= 2) {
                long x = freq[i];
                ans+=(x*(x-1))/2;
            }
        }
        return (int)ans;
    }
}
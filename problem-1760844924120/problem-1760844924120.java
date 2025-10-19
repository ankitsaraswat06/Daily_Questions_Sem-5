// Last updated: 19/10/2025, 09:05:24
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] freq = new int[101];
        for(int el: nums) freq[el]++;
        int sum =0;
        for(int i=1; i<101; i++) {
            if(freq[i]!=0 && freq[i]%k==0) sum+=i*freq[i];
        }
        return sum;
        
    }
}
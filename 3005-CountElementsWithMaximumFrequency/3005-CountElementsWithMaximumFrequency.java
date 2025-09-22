// Last updated: 22/09/2025, 18:26:55
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for(int i=0; i<nums.length; i++) freq[nums[i]]++;
        int maxFreq = Integer.MIN_VALUE;
        for(int i=0; i<101; i++) {
            if(freq[i] > maxFreq) maxFreq = freq[i];
        }
        System.out.println(maxFreq);
        int c = 0;
        for(int i=0; i<101; i++) if(freq[i] == maxFreq) c++;
        return c * maxFreq;
    }
}
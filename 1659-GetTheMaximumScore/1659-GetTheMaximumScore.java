// Last updated: 02/08/2025, 18:54:06
class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        long sum = 0;
        int i =0;
        int j=0;
        while(i<nums1.length && j<nums2.length) { 
            if(nums1[i] < nums2[j]) {
                sum1+=nums1[i];
                i++;
            } else if(nums2[j] < nums1[i]) {
                sum2+=nums2[j];
                j++;
            } else {
                sum += Math.max(sum1 + nums1[i], sum2 + nums2[j]);
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while(i<nums1.length) {
            sum1+=nums1[i];
            i++;
        }

        while(j<nums2.length) {
            sum2+=nums2[j];
            j++;
        }

        sum+=Math.max(sum1, sum2);

        return (int) (sum % (1000000000 + 7));
        
    }
}
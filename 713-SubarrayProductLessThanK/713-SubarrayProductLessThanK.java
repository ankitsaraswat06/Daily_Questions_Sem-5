// Last updated: 02/08/2025, 18:55:58
class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int count =0, start =0, end=0, product = 1;
        while(end < arr.length) {
            // grow
            product= product * arr[end];
            // shrink
            while(product >= k && start<=end) {
                product= product/ arr[start];
                start++;
            }
            //ans update
            count+=(end-start+1);
            end++;
            

        }

        return count;
               
    }
}
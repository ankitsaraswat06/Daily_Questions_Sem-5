// Last updated: 02/08/2025, 18:55:01
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        int k = sum/3;
        if(k*3 != sum) return false;
        int cSum = 0, count = 0;
        for(int i=0; i<arr.length; i++) {
            cSum+=arr[i];
            if(cSum==k) {
                count++;
                cSum = 0;
                if(count==3) return true;
            }
        }
        return false;
        
    }
}
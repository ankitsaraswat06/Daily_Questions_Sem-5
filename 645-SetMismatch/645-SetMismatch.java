// Last updated: 02/08/2025, 18:56:08
class Solution {
    public int[] findErrorNums(int[] nums) {
        int count[] = new int[nums.length+1];
        for(int i=0; i<nums.length; i++) {
            count[nums[i]] ++;
        }

        int arr[] = new int[2];
        for(int i=1; i<count.length; i++) {
            if(count[i]==0) {
                arr[1] = i;
            }
        }

         for(int i=1; i<count.length; i++) {
            if(count[i]==2) {
                arr[0] = i;
            }
        }
        return arr;


    }
}
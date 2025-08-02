// Last updated: 02/08/2025, 18:59:26
class Solution {
    public int firstMissingPositive(int[] nums) {    
        int arr[] = new int[nums.length];
        int idx= 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>0) {
                arr[idx++] = nums[i];
            }
        }
        int ans[] = Arrays.copyOfRange(arr, 0, idx);
        Arrays.sort(ans);
        int target = 1;
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        for(int i=0; i<ans.length; i++) {
            if(ans[i] == target) {
                target++;
            } else if(ans[i] > target) {
                return target;
            }
        }
        return target;
    }
}
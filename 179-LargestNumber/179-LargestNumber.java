// Last updated: 02/08/2025, 18:57:58
class Solution {
    public String largestNumber(int[] nums) {
        int flag = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                flag = 1;
                break;
            }
        }
        if(flag==0) {
            return "0";
        }

        String[] arr = new String[nums.length];
        for(int i=0; i<nums.length; i++) {
            arr[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb  = new StringBuilder();
        for(int i=0; i<nums.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
        
    }
}
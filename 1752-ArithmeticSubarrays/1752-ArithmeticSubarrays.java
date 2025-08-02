// Last updated: 02/08/2025, 18:54:08
class Solution {
    public boolean isArithmatic(int i, int j, int[] nums) {
        int[] arr = new int[j-i+1];
        int idx = 0;
        for(int k=i; k<=j; k++) {
            arr[idx++] = nums[k];
        }
        Arrays.sort(arr);
        for(int k =1; k<arr.length-1; k++) {
            if(arr[k]-arr[k-1]!=arr[k+1]-arr[k]) return false;
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int p=0; p<l.length; p++) {
            int i = l[p];
            int j = r[p];
            if(isArithmatic(i,j, nums)) ans.add(true);
            else ans.add(false);
        }
        return ans;
        
    }
}
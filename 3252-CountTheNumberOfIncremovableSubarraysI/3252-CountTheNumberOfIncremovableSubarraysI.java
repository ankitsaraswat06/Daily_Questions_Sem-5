// Last updated: 02/08/2025, 18:52:12
class Solution {
    public static boolean isStrictlyIncreasing(ArrayList<Integer> ll) {
        for(int i=1; i<ll.size(); i++) {
            if(ll.get(i) <= ll.get(i-1)) return false;
        }
        return true;
    }
    public int incremovableSubarrayCount(int[] nums) {
        int count = 0; 
        for(int i=0; i<=nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                ArrayList<Integer> ll = new ArrayList<>();
                for(int k = 0; k<=i-1; k++) {
                    ll.add(nums[k]);
                }
                for(int k= j+1; k<=nums.length-1; k++) {
                    ll.add(nums[k]);
                }
                if(isStrictlyIncreasing(ll)) count++;
            }
        }
        return count;
    }
}
// Last updated: 02/08/2025, 18:53:32
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ll = new ArrayList<>();
        int smaller = 0;
        for(int i=0; i<nums.length;i++) {
            if(nums[i] < target) smaller++;
        }
        int equal = 0;
        for(int i=0;i<nums.length; i++) {
            if(nums[i] == target) equal++;
        }
        for(int i=0; i<equal; i++) {
            ll.add(smaller++);
        }
        return ll;
    }
}
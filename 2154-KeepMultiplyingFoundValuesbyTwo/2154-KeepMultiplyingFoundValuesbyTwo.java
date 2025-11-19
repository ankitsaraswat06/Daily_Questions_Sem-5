// Last updated: 19/11/2025, 10:52:35
class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for(int el: nums) set.add(el);
        while(set.contains(original)) {
            original = original*2;
        }
        return original;
        
    }
}
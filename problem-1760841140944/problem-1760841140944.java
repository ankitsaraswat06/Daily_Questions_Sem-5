// Last updated: 19/10/2025, 08:02:20
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for(int el: nums) st.add(el);
        int i=1;
        while(true) {
            if(!st.contains(k*i)) return k*i;
            i++;
        }
        
    }
}
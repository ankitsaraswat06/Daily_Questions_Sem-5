// Last updated: 21/10/2025, 15:38:10
class Solution { 
    public int findRadius(int[] houses, int[] heaters) {
        Set<Integer> st = new HashSet<>();
        for(int el: heaters) st.add(el);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<houses.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int el: heaters) {
                min = Math.min(Math.abs(el-houses[i]), min);
            }
            max = Math.max(min, max);
        }
        return max;
    }  
}
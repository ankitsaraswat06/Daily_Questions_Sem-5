// Last updated: 03/11/2025, 14:41:18
class Solution {
    public int minCost(String colors, int[] neededTime) {
        List<HashSet<Integer>> ll = new ArrayList<>();
        for(int i=1; i<colors.length(); i++) {
            if(colors.charAt(i)==colors.charAt(i-1)) {
                if(ll.isEmpty()) ll.add(new HashSet<Integer>());
                ll.get(ll.size()-1).add(i);
                ll.get(ll.size()-1).add(i-1);
            } else {
                ll.add(new HashSet<Integer>());
            }
        }
        int ans = 0;
        
        for(HashSet<Integer> st: ll) {
            if(st.isEmpty()) continue;
            int total = 0;
            int max = Integer.MIN_VALUE;
            for(int el: st) {
                total = neededTime[el] + total;
                max = Math.max(max, neededTime[el]);
            }
            ans += total -max;

        }
        return ans;
    }
}
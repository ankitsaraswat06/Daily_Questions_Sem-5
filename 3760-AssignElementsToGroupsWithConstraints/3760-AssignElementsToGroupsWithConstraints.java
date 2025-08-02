// Last updated: 02/08/2025, 15:28:22
class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<elements.length; i++) {
            map.putIfAbsent(elements[i], i);
        }
        int ans[] = new int[groups.length];
        for(int i=0; i<groups.length; i++) {
            int minIdx = Integer.MAX_VALUE;
            for(int d = 1; d*d <= groups[i]; d++) {
                if(groups[i]%d==0) {
                    if(map.containsKey(d)) {
                        minIdx = Math.min(minIdx, map.get(d));
                    }
                    int od = groups[i]/d;
                    if(map.containsKey(od)) {
                        minIdx = Math.min(minIdx, map.get(od));
                    }
                }
                
            }
            ans[i] = (minIdx == Integer.MAX_VALUE)?-1:minIdx;
        }
        

        return ans;
    }
}
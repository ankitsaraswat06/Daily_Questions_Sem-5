// Last updated: 02/08/2025, 18:54:32
class Solution {
    public int containsAtMostK(String s, int k) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int si =0, count = 0;
        for(int ei =0; ei<s.length(); ei++) {
            // grow
            freqMap.put(s.charAt(ei), freqMap.getOrDefault(s.charAt(ei),0) + 1);
            // shrink
            while(freqMap.size() > k) {
                freqMap.put(s.charAt(si), freqMap.get(s.charAt(si)) - 1);
                if(freqMap.get(s.charAt(si)) == 0) {
                    freqMap.remove(s.charAt(si));
                }
                si++;
            }

            // update ans
            count+=ei-si+1;
        }

        return count;
        
    }
    public int numberOfSubstrings(String s) {
        return containsAtMostK(s, 3) - containsAtMostK(s, 2);
        
    }
}
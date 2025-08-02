// Last updated: 02/08/2025, 18:56:36
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }  
        System.out.print(map);
        StringBuilder st = new StringBuilder();
        int t = map.size();
        while(t-- > 0) {
            char maxChar = 'a';
            int maxCount = 0;
            for(char i: map.keySet()) {
                int count = map.get(i);
                if(count> maxCount) {
                    maxCount = count;
                    maxChar = i;
                }
            }
            for(int i=0; i<maxCount; i++) {
                st.append(maxChar);
            }
            map.remove(maxChar);
        }
        return st.toString();
    }
}
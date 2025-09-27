// Last updated: 27/09/2025, 14:13:33
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            pq.add(e);
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            int c = pq.peek().getValue();
            char ch = pq.peek().getKey();
            for(int i=0; i<c; i++) sb.append(ch);
            pq.poll();
        }
        return sb.toString();
    }
}
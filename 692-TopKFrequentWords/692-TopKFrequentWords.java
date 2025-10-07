// Last updated: 07/10/2025, 22:09:11
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,b)-> {
            if(!a.getValue().equals(b.getValue())) {
                return b.getValue()-a.getValue();
            } else {
                return a.getKey().compareTo(b.getKey());
            }
        });
        HashMap<String, Integer> map = new HashMap<>();
        for(String el: words) {
            map.put(el, map.getOrDefault(el, 0)+1);
        }
        for(Map.Entry pair: map.entrySet()) {
            pq.add(pair);
        }
        List<String> ll = new ArrayList<>();
        for(int i=0; i<k; i++) {
            ll.add(pq.poll().getKey());
        }
        return ll;
    }
}
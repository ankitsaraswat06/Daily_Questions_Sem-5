// Last updated: 07/10/2025, 22:02:34
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int el: nums) {
            map.put(el, map.getOrDefault(el, 0)+1);
        }
        for(Map.Entry pair: map.entrySet()) {
            pq.add(pair);
        }
        int ans[] = new int[k];
        for(int i=0; i<k; i++) {
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}
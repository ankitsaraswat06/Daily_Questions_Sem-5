// Last updated: 02/08/2025, 18:54:49
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int freq[] = new int[map.size()];
        int idx = 0;
        for(int key: map.keySet()) {
            freq[idx++] = map.get(key);
        }
        Arrays.sort(freq);
        for(int i=1; i<freq.length; i++) {
            if(freq[i] == freq[i-1]) return false;
        }
        return true;
    }
}
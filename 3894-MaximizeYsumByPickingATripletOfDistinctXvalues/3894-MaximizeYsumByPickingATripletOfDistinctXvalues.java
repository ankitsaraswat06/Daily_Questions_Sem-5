// Last updated: 02/08/2025, 15:28:01
class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<x.length; i++) {
            map.put(x[i], Math.max(map.getOrDefault(x[i],0), y[i]));
        }
        if(map.size() < 3) return -1;
        int[] arr = new int[map.size()];
        int idx = 0;
        for(int val: map.values()) {
            arr[idx++] = val;
        }
        Arrays.sort(arr);
        return arr[arr.length-1] + arr[arr.length-2] + arr[arr.length-3];
    }
}
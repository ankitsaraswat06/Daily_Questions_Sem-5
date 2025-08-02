// Last updated: 02/08/2025, 18:53:37
class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n%2!=0) return new int[0];
        Arrays.sort(changed);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(changed[i], map.getOrDefault(changed[i], 0)+1);
        }
        List<Integer> ll = new ArrayList<>();
        
        for(int k: changed) {
            if(map.get(k)==0) continue;
            if(map.getOrDefault(k*2, 0)==0) return new int[0];
            ll.add(k);
            map.put(k, map.get(k)-1);
            map.put(k*2, map.get(k*2)-1);
        }
        int arr[] = new int[n/2];
        int idx = 0;
        while(ll.size()>0) {
            arr[idx++] = ll.remove(0);
        }
        return arr;
    }
}
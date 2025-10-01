// Last updated: 01/10/2025, 13:34:24
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1], a[1]));
        for(int i=0; i<boxTypes.length; i++) {
            pq.add(boxTypes[i]);
        }  
        int ans = 0;
        while(!pq.isEmpty() && truckSize>0) {
            int[] arr = pq.poll();
            int units = arr[1];
            int count = arr[0];
            if(count>truckSize) count = truckSize;
            ans = ans + count*units;
            truckSize-=count;

        }
        return ans;
    }
}
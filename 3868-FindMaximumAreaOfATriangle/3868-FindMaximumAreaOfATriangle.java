// Last updated: 02/08/2025, 15:28:04
class Solution {
    public long maxArea(int[][] points) {
        Map<Integer, int[]> xMap = new HashMap<>();
        Map<Integer, int[]> yMap = new HashMap<>();

        long minX = Long.MAX_VALUE, maxX = Long.MIN_VALUE;
        long minY = Long.MAX_VALUE, maxY = Long.MIN_VALUE;

        for(int[] pt: points) {
            int x = pt[0], y = pt[1];
            xMap.putIfAbsent(x, new int[]{y, y});
            xMap.get(x)[0] = Math.min(xMap.get(x)[0],y);
            xMap.get(x)[1] = Math.max(xMap.get(x)[1], y);

            yMap.putIfAbsent(y, new int[]{x, x});
            yMap.get(y)[0] = Math.min(yMap.get(y)[0], x);
            yMap.get(y)[1] = Math.max(yMap.get(y)[1], x);


            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }
        long res = 0;
        for(Map.Entry<Integer, int[]> e: xMap.entrySet()) {
            long base = e.getValue()[1] - e.getValue()[0];
            if(base == 0) continue;
            long height = Math.max (e.getKey() - minX, maxX - e.getKey());
            if(height>0) res= Math.max(res, base*height);
        }

        for(Map.Entry<Integer, int[]> e: yMap.entrySet()) {
            long base = e.getValue()[1] - e.getValue()[0];
            if(base == 0) continue;
            long height = Math.max(e.getKey() - minY, maxY - e.getKey());
            if(height>0) res = Math.max(res, base * height);
        }

        return res>0 ? res: -1;
    }
}
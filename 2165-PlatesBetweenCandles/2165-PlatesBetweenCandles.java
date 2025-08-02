// Last updated: 02/08/2025, 18:53:34
class Solution {
    public int firstOcc(List<Integer> candles, int target) {
        int lo = 0;
        int hi = candles.size()-1;
        int ans = Integer.MAX_VALUE;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(candles.get(mid) >= target) {
                ans = candles.get(mid);
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        return ans;
    }

    public int lastOcc(List<Integer> candles, int target) {
        int lo = 0;
        int hi = candles.size()-1;
        int ans= Integer.MIN_VALUE;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(candles.get(mid) <= target) {
                ans = candles.get(mid);
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return ans;
    }
    public int[] platesBetweenCandles(String s, int[][] queries) {
        List<Integer> candles = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='|') candles.add(i);
        }
        int[] pSum = new int[s.length()];
        pSum[0] = (s.charAt(0)=='*'? 1 : 0);
        for(int i=1; i<s.length(); i++) {
            pSum[i] = pSum[i-1] + (s.charAt(i)=='*'? 1: 0);
        }
        int ans[] = new int[queries.length];
        for(int i =0; i<queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int firstOcc = firstOcc(candles, start);
            int lastOcc = lastOcc(candles, end);
            if(firstOcc<lastOcc) {
                ans[i] = pSum[lastOcc]-pSum[firstOcc];   
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }
}
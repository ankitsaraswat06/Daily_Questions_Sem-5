// Last updated: 02/08/2025, 18:56:44
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(o -> o[1]));
        int non = 1;
        int time = intervals[0][1];
        for(int i=1; i<intervals.length; i++) {
            if(intervals[i][0]>=time) {
                non++;
                time = intervals[i][1];
            }
        }
        return intervals.length - non;
    }
}
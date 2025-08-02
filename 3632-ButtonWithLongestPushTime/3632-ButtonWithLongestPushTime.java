// Last updated: 02/08/2025, 15:28:53
class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int maxTime = events[0][1];
        int maxIndex = events[0][0];
        for(int i=1; i<events.length; i++) {
            if(events[i][1] - events[i-1][1] > maxTime || (events[i][1] - events[i-1][1] == maxTime && events[i][0] < maxIndex)) {
                maxTime = events[i][1] - events[i-1][1];
                maxIndex = events[i][0];
            }
        }
        return maxIndex;
    }
}
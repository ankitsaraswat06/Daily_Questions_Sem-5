// Last updated: 02/08/2025, 18:52:57
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count = 0;
        boolean isVisited[] = new boolean[trainers.length];
        int i = 0, j=0;
        while(i<players.length && j<trainers.length) {
            if(players[i] <= trainers[j] && !isVisited[j]) {
                count ++;
                isVisited[j] = true;
                i++;
                j++;
            } else {
                j++;
            }
            if(i<players.length && j == trainers.length) {
                i++;
                j=0;
            }
        }

        return count;
    }
}
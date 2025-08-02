// Last updated: 02/08/2025, 18:54:19
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum = 0;
        int n = cardPoints.length;
        int answer = 0;
        for(int i=0; i<n; i++) {
            totalSum+=cardPoints[i];
        }
        int sum = 0;
        for(int i=0; i<n-k; i++) {
            sum+=cardPoints[i];
        }
        answer = Math.max(answer, totalSum-sum);

        for(int i=n-k; i<n; i++) {
            sum+=cardPoints[i];
            sum-=cardPoints[i-(n-k)];
            answer = Math.max(answer, totalSum-sum);
        }

        return answer;

    }
}
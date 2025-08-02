// Last updated: 02/08/2025, 18:53:36
class Solution {
    public static int operate(String answerKey, int k, int ch) {
        int si = 0, ei = 0, flip = 0, ans = 0;
        while(ei<answerKey.length()) {
            if(answerKey.charAt(ei) == ch) {
                flip++;
            }

            while(flip>k && si<=ei) {
                if(answerKey.charAt(si) == ch) {
                    flip--;
                }
                si++;
            }
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int flip_f = operate(answerKey, k, 'F');
        int flip_t = operate(answerKey, k, 'T');
        return Math.max(flip_f, flip_t);   
    }
}
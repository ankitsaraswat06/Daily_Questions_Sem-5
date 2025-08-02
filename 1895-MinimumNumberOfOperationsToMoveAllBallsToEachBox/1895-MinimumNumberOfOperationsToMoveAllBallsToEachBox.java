// Last updated: 02/08/2025, 18:53:51
class Solution {
    public int[] minOperations(String boxes) {
        int [] answers = new int[boxes.length()];
        int idx = 0;
        while(idx<boxes.length()) {
            for(int i=boxes.length()-1; i>idx; i--) {
                if(boxes.charAt(i)=='1') {
                    answers[idx]+=Math.abs(i-idx);
                }
            }
            for(int j=0; j<idx; j++) {
                if(boxes.charAt(j)=='1') {
                    answers[idx]+=Math.abs(j-idx);
                }
            }
            idx++;
        }

        return answers;
        
        
    }
}
// Last updated: 02/08/2025, 15:28:30
class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int idx = 0;
        long score = 0;
        int n = values.length;
        while(idx >= 0 && idx < n) {    
            if(instructions[idx].equals("jump")) {
                instructions[idx] = "e";
                idx = idx + values[idx];
            } else if(instructions[idx].equals("add")) {
                instructions[idx] = "e";
                score = score + values[idx];
                idx++;
            } else {
                break;
            }
        }
        return score;
        
    }
}
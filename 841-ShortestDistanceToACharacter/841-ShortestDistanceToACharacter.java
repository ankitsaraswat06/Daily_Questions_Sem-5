// Last updated: 02/08/2025, 18:55:40
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int output[] = new int[n];
        List<Integer> found = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == c) {
                found.add(i);
            }
        }
        for(int i=0; i<s.length(); i++) {
            int min = Integer.MAX_VALUE;
            for(int j=0; j<found.size(); j++) {
                min = Math.min(Math.abs(i-found.get(j)), min);
            }
            output[i] = min;
        }
        return output;
        
    }
}
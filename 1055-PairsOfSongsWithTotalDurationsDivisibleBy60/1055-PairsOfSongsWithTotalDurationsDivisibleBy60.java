// Last updated: 02/08/2025, 18:55:02
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<time.length; i++) {
            int rem = time[i]%60;
            int remReq = (60-rem)%60;
            count+=map.getOrDefault(remReq, 0);
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }   
        return count;
    }
}
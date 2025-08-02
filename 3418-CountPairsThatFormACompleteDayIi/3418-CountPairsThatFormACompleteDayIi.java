// Last updated: 02/08/2025, 18:52:00
class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<hours.length; i++) {
            int rem = hours[i]%24;
            int reqRem = (24-rem)%24;
            count+=map.getOrDefault(reqRem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}
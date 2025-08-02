// Last updated: 02/08/2025, 18:55:24
class Solution {
    public int totalFruit(int[] fruits) {
        int si = 0, count = 0, type = 0;
        int[] freq = new int[fruits.length];
        for(int ei = 0; ei<fruits.length; ei++) {
            // grow window
            if(freq[fruits[ei]]==0) {
                type++;
            }
            freq[fruits[ei]]++;

            // shrink window

            while(type>2) {
                freq[fruits[si]]--;
                if(freq[fruits[si]]==0) {
                    type--;
                }
                si++;
            }

            // update answer

            count = Math.max(count, ei-si+1);

        }
        return count;
    }
}
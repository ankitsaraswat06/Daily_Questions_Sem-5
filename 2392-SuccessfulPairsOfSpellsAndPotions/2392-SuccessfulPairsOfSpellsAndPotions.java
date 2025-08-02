// Last updated: 02/08/2025, 18:53:06
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int count = 0;
        int ans[] = new int[spells.length];
        for(int i=0; i<spells.length; i++) {
            long need = (success + spells[i] - 1) / spells[i];
            int start = 0;
            int end = potions.length-1;;
            int firstIndex = potions.length;
            while(start<=end) {
                int mid = start + (end-start)/2;
                if(potions[mid] >= need) {
                    firstIndex = mid;
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
            ans[i] = potions.length-firstIndex;
        }
        return ans;
        
    }
}
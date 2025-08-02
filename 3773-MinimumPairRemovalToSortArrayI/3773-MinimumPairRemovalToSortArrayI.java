// Last updated: 02/08/2025, 15:28:21
class Solution {
    public boolean isNonDec(List<Integer> nums) {
        for(int i=1; i<nums.size(); i++) {
            if(nums.get(i) < nums.get(i-1)) return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        for(int num: nums) ll.add(num);
        int count = 0;
        while(!isNonDec(ll)) {
            int minSum = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int i=0; i<ll.size()-1; i++) {
                if(ll.get(i) + ll.get(i+1) < minSum)  {
                    minSum = ll.get(i) + ll.get(i+1);
                    minIdx = i;
                }
            }
            ll.set(minIdx, minSum);
            ll.remove(minIdx+1);
            count++;
        }
        return count;
    }
}
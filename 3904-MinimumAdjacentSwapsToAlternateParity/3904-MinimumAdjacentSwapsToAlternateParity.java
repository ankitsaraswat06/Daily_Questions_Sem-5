// Last updated: 02/08/2025, 15:28:00
class Solution {
    public int getSwaps(List<Integer> indices, int start) {
        int res= 0;
        for(int i=0; i<indices.size(); i++) {
            res+=Math.abs(indices.get(i) - (start+2*i));
        }
        return res;
    }
    public int minSwaps(int[] nums) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        int n = nums.length;

        for(int i=0; i<n; i++) {
            if(nums[i]%2==0) evens.add(i);
            else odds.add(i);
        }
        if(Math.abs(evens.size()-odds.size()) > 1) return -1;
        int ans = Integer.MAX_VALUE;

        if(evens.size() >= odds.size()) ans = Math.min(ans, getSwaps(evens, 0));
        if(odds.size()>=evens.size()) ans = Math.min(ans, getSwaps(odds, 0));
        return ans;
        
    }
}
// Last updated: 04/10/2025, 11:47:25
class Solution {
    public void rec(int[] nums, int idx, List<Integer> ll, List<List<Integer>> ans) {

        ans.add(new ArrayList<>(ll));
        for(int i=idx; i<nums.length; i++) {
            if(i>idx && nums[i]==nums[i-1]) continue;
            ll.add(nums[i]);
            rec(nums, i+1, ll, ans);
            ll.remove(ll.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        rec(nums, 0, ll, ans);
        return ans;
        
    }
}
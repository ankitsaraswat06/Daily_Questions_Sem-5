// Last updated: 02/08/2025, 18:58:51
class Solution {
    public void subSet(int[] nums, int idx, ArrayList<Integer> ll, List<List<Integer>> ans) {
        if(idx>=nums.length) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        ll.add(nums[idx]);
        subSet(nums, idx+1, ll, ans);
        ll.remove(ll.size()-1);
        subSet(nums, idx+1, ll, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subSet(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }
}
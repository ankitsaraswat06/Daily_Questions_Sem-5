// Last updated: 04/10/2025, 10:55:35
class Solution {
    public void rec(int[] nums, int idx, List<Integer> ll, List<List<Integer>> ans) {
        // if(idx==nums.length) {
        //     ans.add(new ArrayList<>(ll));
        //     return;
        // }
        // // pick
        // ll.add(nums[idx]);
        // rec(nums, idx+1, ll, ans);
        // ll.remove(ll.size()-1);
        // // not pick
        // rec(nums, idx+1, ll, ans);

        ans.add(new ArrayList<>(ll));
        for(int i=idx; i<nums.length; i++) {
            ll.add(nums[i]);
            rec(nums, i+1, ll, ans);
            ll.remove(ll.size()-1);
        }


    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        rec(nums, 0, ll, ans);
        return ans;
        
    }
}
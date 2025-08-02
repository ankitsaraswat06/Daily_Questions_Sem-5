// Last updated: 02/08/2025, 18:58:42
class Solution {
    public void subSet(int[] nums, int idx, ArrayList<Integer> ll, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ll));

        for(int i=idx; i<nums.length; i++) {
            if(i>idx && nums[i]==nums[i-1]) continue;
            ll.add(nums[i]);
            subSet(nums, i+1, ll, ans);
            ll.remove(ll.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subSet(nums, 0, ll, ans); 
        return ans;
    }
}
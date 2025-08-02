// Last updated: 02/08/2025, 18:58:35
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void rec(TreeNode root, int target, List<List<Integer>> ans, List<Integer> ll) {
        if(root==null) return;
        ll.add(root.val);
        if(root.left==null && root.right==null) {
            if(target- root.val ==0) {
                ans.add(new ArrayList<>(ll));
            }
        } else {
            rec(root.left, target-root.val, ans, ll);
            rec(root.right, target-root.val, ans, ll);
        }
        ll.remove(ll.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        rec(root, targetSum, ans, ll);
        return ans;
    }
}
// Last updated: 18/08/2025, 14:33:20
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
    public void rec(TreeNode root, List<Integer> ll) {
        if(root==null) return;
        ll.add(root.val);
        rec(root.left, ll);
        rec(root.right, ll);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        rec(root, ll);
        return ll;
    }
}
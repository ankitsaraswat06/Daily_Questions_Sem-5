// Last updated: 03/08/2025, 17:02:00
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
    public void rec(TreeNode root) {
        if(root==null) return;
        TreeNode t = root.right;
        root.right = root.left;
        root.left = t;
        rec(root.left);
        rec(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        rec(root);
        return root;
    }
}
// Last updated: 19/08/2025, 22:26:03
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
    TreeNode ans = null;
    public void rec(TreeNode root, int val)  {
        if(root==null) return;
        if(root.val==val) ans = root;
        rec(root.left, val);
        rec(root.right, val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        rec(root, val);
        return ans;
    }
}
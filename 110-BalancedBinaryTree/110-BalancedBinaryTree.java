// Last updated: 02/08/2025, 18:58:38
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
    class BalancePair {
        boolean isBal= true;
        int ht = -1;
    }
    public BalancePair isBalance(TreeNode root) {
        if(root==null) {
            return new BalancePair();
        }
        BalancePair lbp = isBalance(root.left);
        BalancePair rbp = isBalance(root.right);
        BalancePair sbp = new BalancePair();
        sbp.ht = Math.max(lbp.ht , rbp.ht) + 1;
        boolean sb = Math.abs(lbp.ht - rbp.ht) <= 1;
        sbp.isBal = lbp.isBal && rbp.isBal && sb;
        return sbp;

    }
    public boolean isBalanced(TreeNode root) {
        return isBalance(root).isBal;
    }
}
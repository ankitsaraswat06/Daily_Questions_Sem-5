// Last updated: 21/08/2025, 07:05:03
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
    long min = Long.MAX_VALUE;
    long secMin = Long.MAX_VALUE;

    public void rec(TreeNode root) {
        if(root==null) return;
        if(root.val < min) {
            secMin = min;
            min = root.val;
        } else if(root.val < secMin && root.val > min) {
            secMin = root.val;
        }
        rec(root.left);
        rec(root.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        rec(root);
        return secMin==Long.MAX_VALUE ? -1 : (int)secMin;
    }
}
// Last updated: 04/08/2025, 22:09:59
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
    int tilt = 0;
    public int rec(TreeNode root) { 
        if(root==null) return 0;
        int l = rec(root.left);
        int r = rec(root.right);
        tilt+=Math.abs(l-r);
        return l + r + root.val;
    }
    public int findTilt(TreeNode root) {
        rec(root);
        return tilt; 
    }
}
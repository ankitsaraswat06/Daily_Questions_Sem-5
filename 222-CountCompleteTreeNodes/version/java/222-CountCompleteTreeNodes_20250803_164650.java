// Last updated: 03/08/2025, 16:46:50
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
    int sum =0;
    public void rec(TreeNode root) {
        if(root==null) return;
        sum++;
        rec(root.left);
        rec(root.right);
    }
    public int countNodes(TreeNode root) {
        rec(root);    
        return sum;
    }
}
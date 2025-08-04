// Last updated: 04/08/2025, 22:03:00
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
    public int sum(TreeNode root) {
        if(root==null) return 0;
        int a = sum(root.left);
        int b = sum(root.right);
        return a+b+root.val;
    }
    public void rec(TreeNode root) {
        if(root==null) return;
        int a = sum(root.left);
        int b = sum(root.right);
        tilt +=  Math.abs(a-b);
        rec(root.left);
        rec(root.right);   
    }
    public int findTilt(TreeNode root) {
        rec(root);
        return tilt; 
    }
}
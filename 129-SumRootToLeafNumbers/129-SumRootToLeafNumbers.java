// Last updated: 02/08/2025, 18:58:26
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
    public int rec(TreeNode root, int sum) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) {
            return sum*10 + root.val;
        }
        int left = rec(root.left, sum*10+root.val);
        int right = rec(root.right, sum*10+root.val);
        return left+right;
    }
    public int sumNumbers(TreeNode root) {  
        return rec(root,0); 
    }
}
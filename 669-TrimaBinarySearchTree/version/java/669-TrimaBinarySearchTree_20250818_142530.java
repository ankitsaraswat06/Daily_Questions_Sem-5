// Last updated: 18/08/2025, 14:25:30
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;

        // If root is too small, ignore left and move to right
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }

        // If root is too large, ignore right and move to left
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }

        // Otherwise, trim both sides
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
}
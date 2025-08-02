// Last updated: 02/08/2025, 18:56:17
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
    class DiaPair {
        int dia = 0;
        int ht = -1;
    }
    public int ht (TreeNode root) {
        if(root==null) return -1;
        int lh = ht(root.left);
        int rh = ht(root.right);
        return Math.max(lh, rh) + 1;
    }

    public DiaPair diameter(TreeNode root) {
        if(root==null) {
            return new DiaPair();
        }
        DiaPair ldp = diameter(root.left);
        DiaPair rdp = diameter(root.right);
        DiaPair sdp = new DiaPair();
        sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
        int sd = ldp.ht + rdp.ht + 2;
        sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
        return sdp;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
    }
}
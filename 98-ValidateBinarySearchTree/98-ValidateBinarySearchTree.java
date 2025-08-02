// Last updated: 02/08/2025, 18:58:40
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
    class BstPair {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        boolean isBst = true;
    }
    public BstPair isValid(TreeNode root) {
        if(root==null) {
            return new BstPair();
        }
        BstPair lbp = isValid(root.left);
        BstPair rbp = isValid(root.right);
        BstPair sbp = new BstPair();
        sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
        sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
        sbp.isBst = lbp.isBst && rbp.isBst && lbp.max < root.val && rbp.min > root.val;
        return sbp;

    }
    public boolean isValidBST(TreeNode root) {
        return isValid(root).isBst;

    }
}
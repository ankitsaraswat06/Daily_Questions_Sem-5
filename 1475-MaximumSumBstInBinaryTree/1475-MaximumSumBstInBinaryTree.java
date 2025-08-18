// Last updated: 18/08/2025, 15:05:48
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
    class bstPair {
        int sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        boolean isbst = true;
        int ans = 0;

    }
    public bstPair validBst(TreeNode root) {
        if(root==null) return new bstPair();
        bstPair lbp = validBst(root.left);
        bstPair rbp = validBst(root.right);
        bstPair sbp = new bstPair();
        sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
        sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
        sbp.sum = lbp.sum + rbp.sum + root.val;
        sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
        if(sbp.isbst) {
            sbp.ans = Math.max(lbp.ans, Math.max(rbp.ans, sbp.sum));
        } else {
            sbp.ans = Math.max(lbp.ans, rbp.ans);
        }
        return sbp;
    }
    public int maxSumBST(TreeNode root) {
        return validBst(root).ans;
        
    }
}
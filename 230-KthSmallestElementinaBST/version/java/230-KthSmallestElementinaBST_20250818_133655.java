// Last updated: 18/08/2025, 13:36:55
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
  int ans = 0;
  int k;
  public void rec(TreeNode root) {
    if(root==null) return;
    rec(root.left);
    k--;
    if(k==0) {
      ans = root.val;
      return;
    }
    rec(root.right);
  }
  public int kthSmallest(TreeNode root, int k) {
    this.k = k;
    rec(root);
    return ans;
  }
}
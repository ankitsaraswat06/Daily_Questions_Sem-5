// Last updated: 18/08/2025, 13:24:20
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
    public void rec(TreeNode root, List<Integer> ll) {
      if(root==null) return;
      rec(root.left, ll);
      ll.add(root.val);
      rec(root.right, ll);
    }
    public int kthSmallest(TreeNode root, int k) {
      List<Integer> ll = new ArrayList<>();
      rec(root, ll);
      return ll.get(k-1);
    }
}
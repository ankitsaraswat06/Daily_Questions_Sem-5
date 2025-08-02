// Last updated: 02/08/2025, 18:57:56
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
    int maxD = 0;
    public void rec(TreeNode root, int cl, List<Integer> ll) {
        if(root==null) return;
        if(maxD<cl) {
            ll.add(root.val);
            maxD = cl;
        }
        rec(root.right, cl+1, ll);
        rec(root.left, cl+1, ll);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        rec(root, 1, ll);
        return ll;
    }
}
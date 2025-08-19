// Last updated: 19/08/2025, 17:01:34
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
    public void rec(TreeNode root, String s, List<String> ll ) {
        if(root==null) {
            s = "";
            return;
        }
        if(root.left==null && root.right==null) {
            s+=root.val;
            ll.add(s);
        } else {
            s+=root.val + "->";
        }
        rec(root.left, s, ll);
        rec(root.right, s, ll);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ll = new ArrayList<>();
        rec(root, "", ll);
        return ll;
    }
}
// Last updated: 21/08/2025, 06:34:29
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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> ll =new ArrayList<>();
        rec(root, ll);
        int min = Integer.MAX_VALUE;
        for(int i=1; i<ll.size(); i++) {
            if(Math.abs(ll.get(i)- ll.get(i-1)) < min) min = Math.abs(ll.get(i)-ll.get(i-1));
        }
        return min;
    }
}
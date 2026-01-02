// Last updated: 02/01/2026, 16:03:50
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
12        if(root == null) return null;
13        if(root==p || root==q) return root;
14        TreeNode left = lca(root.left, p, q);
15        TreeNode right = lca(root.right, p, q);
16        if(left!=null && right!=null) return root;
17        if(left==null) return right;
18        else return left;
19    }
20    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
21        return lca(root, p, q);
22        
23    }
24}
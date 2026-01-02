// Last updated: 02/01/2026, 15:39:09
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int height(TreeNode root) {
18        if(root==null) return 0;
19        int left = height(root.left)+1;
20        int right = height(root.right)+1;
21        return Math.max(left, right);
22    }
23    public int diameterOfBinaryTree(TreeNode root) {
24        if(root==null) return 0;
25        int left = height(root.left);
26        int right = height(root.right);
27        int ans = left+right;
28        int next = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
29        return Math.max(ans, next);
30    }
31}
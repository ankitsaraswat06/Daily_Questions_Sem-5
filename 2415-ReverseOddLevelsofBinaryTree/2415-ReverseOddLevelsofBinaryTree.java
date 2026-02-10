// Last updated: 10/02/2026, 16:30:48
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
17    public void rec(TreeNode left, TreeNode right, int l) {
18        if(left==null) return;
19        if(l%2!=0) {
20            int temp = left.val;
21            left.val = right.val;
22            right.val = temp;
23        }
24        rec(left.left, right.right, l+1);
25        rec(left.right,right.left, l+1);
26    }
27    public TreeNode reverseOddLevels(TreeNode root) {
28        rec(root.left, root.right, 1);
29        return root;
30        
31    }
32}
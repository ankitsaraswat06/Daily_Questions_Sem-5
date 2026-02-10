// Last updated: 10/02/2026, 15:38:44
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
17    int MOD = 1000000007;
18    public long find(TreeNode root, int tSum) {
19        if(root==null) return 0;
20        long ansL = 0;
21        long ansR = 0;
22        if(root.left!=null) ansL= (long)(tSum-root.left.val) * root.left.val;
23        if(root.right!=null) ansR=(long)(tSum-root.right.val)*root.right.val;
24        long ans = Math.max(ansL, ansR);
25        return Math.max(ans, Math.max(find(root.left, tSum), find(root.right, tSum)));
26    }
27    public long rec(TreeNode root) {
28        if(root==null) return 0;
29        if(root.left==null && root.right==null) return root.val;
30        long sum = rec(root.left) + rec(root.right) + root.val;
31        root.val = (int)sum;
32        return sum;
33    }
34    public int maxProduct(TreeNode root) {
35        int tSum = (int)rec(root);
36        return (int)(find(root, tSum)%MOD);
37    }
38}
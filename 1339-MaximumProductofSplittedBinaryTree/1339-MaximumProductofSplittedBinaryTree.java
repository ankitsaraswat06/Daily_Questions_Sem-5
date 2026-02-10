// Last updated: 10/02/2026, 15:37:23
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
22        if(root.left!=null) {
23            
24            ansL= (long)(tSum-root.left.val) * root.left.val;
25        }
26        if(root.right!=null) {
27            
28            ansR=(long)(tSum-root.right.val)*root.right.val;
29        }
30        long ans = Math.max(ansL, ansR);
31        return Math.max(ans, Math.max(find(root.left, tSum), find(root.right, tSum)));
32    }
33    public long rec(TreeNode root) {
34        if(root==null) return 0;
35        if(root.left==null && root.right==null) return root.val;
36        long sum = rec(root.left) + rec(root.right) + root.val;
37        root.val = (int)sum;
38        return sum;
39    }
40    public int maxProduct(TreeNode root) {
41        int tSum = (int)rec(root);
42        return (int)(find(root, tSum)%MOD);
43    }
44}
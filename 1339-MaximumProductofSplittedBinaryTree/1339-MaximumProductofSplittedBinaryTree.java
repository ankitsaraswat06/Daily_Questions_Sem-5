// Last updated: 10/02/2026, 15:31:45
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
23            long x=tSum-root.left.val;
24            long p=x*root.left.val;
25            ansL=p;
26        }
27        if(root.right!=null) {
28            long x=tSum-root.right.val;
29            long p=x*root.right.val;
30            ansR=p;
31        }
32        long ans = Math.max(ansL, ansR);
33        return Math.max(ans, Math.max(find(root.left, tSum), find(root.right, tSum)));
34    }
35    public long rec(TreeNode root) {
36        if(root==null) return 0;
37        if(root.left==null && root.right==null) return root.val;
38        long sum = rec(root.left) + rec(root.right) + root.val;
39        root.val = (int)sum;
40        return sum;
41    }
42    public int maxProduct(TreeNode root) {
43        int tSum = (int)rec(root);
44        return (int)(find(root, tSum)%MOD);
45    }
46}
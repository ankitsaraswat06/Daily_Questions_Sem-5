// Last updated: 02/01/2026, 15:30:00
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
17    public int rec(TreeNode root, long target) {
18        if(root==null) return 0;
19        int count =0;
20        if(root.val == target) count++;
21        count += rec(root.left, target-root.val);
22        count += rec(root.right, target-root.val);
23        return count;
24    }
25    public int pathSum(TreeNode root, int targetSum) {
26        if(root==null) return 0;
27       int count = rec(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
28       return count;
29
30        
31    }
32}
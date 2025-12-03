// Last updated: 03/12/2025, 11:22:30
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
17    public boolean dfs(TreeNode root, int k, Set<Integer> set) {
18        if(root==null) return false;
19        if(set.contains(k-root.val)) return true;
20        set.add(root.val);
21        boolean l = dfs(root.left, k, set);
22        boolean r = dfs(root.right, k, set);
23        return l || r;
24
25    }
26    public boolean findTarget(TreeNode root, int k) {
27        Set<Integer> set = new HashSet<>();
28        return dfs(root, k, set);
29        
30    }
31}
// Last updated: 16/02/2026, 10:37:03
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> ll = new ArrayList<>();
19        Stack<TreeNode> st = new Stack<>();
20        while(root != null || !st.isEmpty()) {
21            while(root != null) {
22                st.push(root);
23                root = root.left;
24            }
25            
26            root = st.pop();
27            ll.add(root.val);
28            root = root.right;
29        }
30        return ll;
31    }
32}
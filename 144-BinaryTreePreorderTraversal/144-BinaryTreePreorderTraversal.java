// Last updated: 16/02/2026, 11:00:24
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        if(root==null) return new ArrayList<>();
19        List<Integer> ll = new ArrayList<>();
20        Stack<TreeNode> st = new Stack<>();
21        st.push(root);
22        while(!st.isEmpty()) {
23            TreeNode rv = st.pop();
24            ll.add(rv.val);
25            if(rv.right!=null) {
26                st.push(rv.right);
27            }
28            if(rv.left!=null) {
29                st.push(rv.left);
30            }
31            
32        }
33        return ll;
34        
35    }
36}
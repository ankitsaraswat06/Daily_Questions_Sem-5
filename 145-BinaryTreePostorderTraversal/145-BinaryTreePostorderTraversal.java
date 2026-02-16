// Last updated: 16/02/2026, 11:47:19
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> result = new ArrayList<>();
19        if (root == null) return result;
20
21        Stack<TreeNode> stack = new Stack<>();
22        stack.push(root);
23
24        while (!stack.isEmpty()) {
25            TreeNode node = stack.pop();  
26            result.add(node.val);
27
28            if (node.left != null) {
29                stack.push(node.left);
30            }
31            if (node.right != null) {
32                stack.push(node.right);
33            }
34            
35        }
36
37        Collections.reverse(result);
38        return result;
39    }
40}
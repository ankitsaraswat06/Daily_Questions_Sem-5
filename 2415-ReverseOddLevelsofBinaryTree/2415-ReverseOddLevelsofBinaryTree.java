// Last updated: 10/02/2026, 16:23:36
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<>();
19        q.offer(root);
20        int l = 0;
21        while(!q.isEmpty()) {
22            int size = q.size();
23            List<TreeNode> ll = new ArrayList<>();
24            while(size-->0) {
25                TreeNode rv = q.poll();
26                ll.add(rv);
27                if(rv.left!=null) q.offer(rv.left);
28                if(rv.right!=null) q.offer(rv.right);
29            }
30
31            if(l%2!=0) {
32                int si = 0;
33                int ei = ll.size()-1;
34                while(si<ei) {
35                    int temp = ll.get(si).val;
36                    ll.get(si).val = ll.get(ei).val;
37                    ll.get(ei).val = temp;
38                    si++;
39                    ei--;
40                }
41            }
42            l++;
43
44        }
45        return root;
46        
47    }
48}
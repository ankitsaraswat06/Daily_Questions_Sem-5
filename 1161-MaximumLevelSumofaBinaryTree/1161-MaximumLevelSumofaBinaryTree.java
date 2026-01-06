// Last updated: 06/01/2026, 07:45:33
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
17    public void find(TreeNode root, List<Integer> ll) {
18        Queue<TreeNode> q = new LinkedList<>();
19        q.add(root);
20        while(!q.isEmpty()) {
21            int size = q.size();
22            int sum = 0;
23            while(size-->0) {
24                TreeNode rv = q.poll();
25                sum+=rv.val;
26                if(rv.left!=null) q.offer(rv.left);
27                if(rv.right!=null) q.offer(rv.right);
28            }
29            ll.add(sum);
30        }
31    }
32    public int maxLevelSum(TreeNode root) {
33        List<Integer> ll = new ArrayList<>();
34        find(root, ll);
35        int max = Integer.MIN_VALUE;
36        int maxIdx =-1;
37        for(int i=0; i<ll.size(); i++) {
38            if(ll.get(i)>max) {
39                max= ll.get(i);
40                maxIdx = i;
41            }
42        }
43        return maxIdx+1;
44    }
45}
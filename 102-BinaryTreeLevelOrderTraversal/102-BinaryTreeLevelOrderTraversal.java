// Last updated: 21/11/2025, 12:38:16
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> ll = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode rm = q.poll();
                if(rm.left!=null) q.add(rm.left);
                if(rm.right!=null) q.add(rm.right);
                ll.add(rm.val);
            }
            ans.add(ll);
        }
        return ans;
        
    }
}
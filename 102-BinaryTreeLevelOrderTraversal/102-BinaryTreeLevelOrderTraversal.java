// Last updated: 21/08/2025, 07:11:39
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
    public void rec(TreeNode root, List<List<Integer>> ans) {
        if(root==null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> ll = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++) {
                TreeNode nn = q.poll();
                if(nn.left!=null) q.add(nn.left);
                if(nn.right!=null) q.add(nn.right);
                ll.add(nn.val);
            }
            ans.add(ll);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> ans = new ArrayList<>();
       rec(root, ans);
       return ans; 
    }
}
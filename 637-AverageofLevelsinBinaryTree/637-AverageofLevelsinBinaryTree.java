// Last updated: 21/08/2025, 06:49:08
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
    public double findAvg(List<Integer> ll) {
        double avg = 0;
        long sum =0;
        for(int i=0; i<ll.size(); i++) {
            sum+=ll.get(i);
        }
        avg = (double) sum/ll.size();
        return avg;
    }
    public void rec(TreeNode root, List<Double> ll) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> n = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode nn = q.poll();
                if(nn.left!=null) q.add(nn.left);
                if(nn.right!=null) q.add(nn.right);
                n.add(nn.val);
            }
            double a = findAvg(n);
            ll.add(a);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ll = new ArrayList<>();
        rec(root, ll);
        return ll;
    }
}
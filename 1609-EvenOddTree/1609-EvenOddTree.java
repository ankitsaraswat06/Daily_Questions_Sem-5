// Last updated: 19/08/2025, 17:37:45
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
    public boolean sI(List<Integer> ll)  {
        if(ll.get(0)%2==0) return false;
        for(int i=1; i<ll.size(); i++) {
            if(ll.get(i) <= ll.get(i-1) || ll.get(i)%2==0) return false;
        }
        return true;
    }

    public boolean sD(List<Integer> ll)  {
        if(ll.get(0)%2!=0) return false;
        for(int i=1; i<ll.size(); i++) {
            if(ll.get(i) >= ll.get(i-1) || ll.get(i)%2!=0) return false;
        }
        return true;
    }
    public boolean isEvenOddTree(TreeNode root) {
        boolean isEven = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> ll = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode nn = q.poll();
                if(nn.left!=null) q.add(nn.left);
                if(nn.right!=null) q.add(nn.right);
                ll.add(nn.val);
            }
            if(isEven && !sI(ll)) return false;
            if(!isEven && !sD(ll)) return false;
            isEven = !isEven;
        }

        return true;
    }
}
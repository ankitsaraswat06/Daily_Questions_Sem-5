// Last updated: 18/08/2025, 14:05:14
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
    public void rec(TreeNode root,  List<Integer> ll) {
        if(root==null) return;
        rec(root.left, ll);
        ll.add(root.val);
        rec(root.right, ll);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        rec(root1, l1);
        rec(root2, l2);
        int i = 0, j=0;
        List<Integer> ans = new ArrayList<>();
        while (i<l1.size() && j<l2.size()) {
            if(l1.get(i) > l2.get(j)) {
                ans.add(l2.get(j));
                j++;
            } else {
                ans.add(l1.get(i));
                i++;
            }
        }
        while(i<l1.size()) {
            ans.add(l1.get(i));
            i++;
        }
        while(j<l2.size()) {
            ans.add(l2.get(j));
            j++;
        }
        return ans;
    }
}
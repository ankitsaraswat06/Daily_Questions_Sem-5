// Last updated: 19/08/2025, 17:15:21
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
    HashMap<Integer, Integer> map = new HashMap<>();
    public void rec(TreeNode root) {
        if(root==null) return;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        rec(root.left);
        rec(root.right);
    }
    public int[] findMode(TreeNode root) {
        rec(root);
        int max = Integer.MIN_VALUE;
        for(int i: map.keySet()) {
            if(map.get(i)> max) max = map.get(i);
        }
        int idx = 0;
        for(int i: map.keySet()) {
            if(map.get(i)==max) idx++;
        }
        int[] arr= new int[idx];
        idx= 0;
        for(int i: map.keySet()) {
            if(map.get(i)==max) {
                arr[idx++] = i;
            }
        }
        return arr;
    }
}
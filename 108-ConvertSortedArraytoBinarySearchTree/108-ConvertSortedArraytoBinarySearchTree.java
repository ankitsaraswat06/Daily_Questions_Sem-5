// Last updated: 19/08/2025, 16:52:49
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
    public TreeNode convert(int[] nums, int si, int ei) {
        if(si> ei) return null;
        int mid = si + (ei-si)/2;
        TreeNode nn = new TreeNode(nums[mid]);
        nn.left = convert(nums, si, mid-1);
        nn.right = convert(nums, mid+1, ei);
        return nn;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length-1);
    }
}
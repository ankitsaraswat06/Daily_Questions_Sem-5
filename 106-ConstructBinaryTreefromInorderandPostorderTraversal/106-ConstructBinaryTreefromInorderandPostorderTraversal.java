// Last updated: 21/08/2025, 07:44:41
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
    public TreeNode rec(int[] in, int[] pos, int ilo, int ihi, int plo, int phi) {
        if(plo>phi || ilo>ihi) return null;
        TreeNode nn = new TreeNode(pos[phi]);
        int idx = -1;
        for(int i=ilo; i<=ihi; i++) {
            if(in[i]==nn.val) {
                idx=i;
                break;
            }
        }
        int sizeL = idx-ilo;
        nn.left = rec(in, pos, ilo, idx-1, plo, plo + sizeL-1);
        nn.right = rec(in, pos, idx+1, ihi, plo+ sizeL, phi-1);
        return nn;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return rec(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }
}
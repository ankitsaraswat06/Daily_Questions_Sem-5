// Last updated: 13/08/2025, 11:35:27
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
    // 1--> havecamera
    // 0--> covered;
    // -1--> need camera
    int camera = 0;
    public int minCameraCover(TreeNode root) {
        int c = minCamera(root);
        if(c==-1) camera++;
        return camera;  
    }
    public int minCamera(TreeNode root) {
        if(root==null) return 0;
        int left = minCamera(root.left);
        int right = minCamera(root.right);
        if(left==-1 || right==-1){ // -1 camera chahiye is node pe
            camera++;
            return 1; // camera setup on this node;
        }
        else if(left==1 || right==1) { // inme se koi ek ke pass ya dono ke pass camera hai and dusra covered hai
            return 0; // mtlb me covered hu
        }
        else {
            return -1;// need hai.. kyuki dono child bas covered hai kisike pas camera nhi
        }

    }
}
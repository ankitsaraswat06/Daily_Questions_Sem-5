// Last updated: 28/08/2025, 12:05:43
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
    class vPair {
        TreeNode nn;
        int vl; // vertical level (column)
        int hl; // horizontal level (row)
        public vPair(TreeNode nn, int hl, int vl) {
            this.nn = nn;
            this.hl = hl;
            this.vl = vl;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<vPair> q = new LinkedList<>();
        q.add(new vPair(root, 0, 0));
        TreeMap<Integer, List<vPair>> map = new TreeMap<>();

        while (!q.isEmpty()) {
            vPair vp = q.poll();
            map.putIfAbsent(vp.vl, new ArrayList<>());
            map.get(vp.vl).add(vp);

            if (vp.nn.left != null) {
                q.add(new vPair(vp.nn.left, vp.hl + 1, vp.vl - 1));
            }
            if (vp.nn.right != null) {
                q.add(new vPair(vp.nn.right, vp.hl + 1, vp.vl + 1));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int key : map.keySet()) {
            List<vPair> ll = map.get(key);
            Collections.sort(ll, (o1, o2) -> {
                if (o1.hl == o2.hl) {
                    return o1.nn.val - o2.nn.val; // sort by value if same row
                }
                return o1.hl - o2.hl; // sort by row
            });

            List<Integer> list = new ArrayList<>();
            for (vPair v : ll) {
                list.add(v.nn.val);
            }

            ans.add(list);
        }

        return ans;
    }
}
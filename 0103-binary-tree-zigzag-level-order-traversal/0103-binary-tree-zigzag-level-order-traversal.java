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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode temp = q.poll();
                

                if (leftToRight) {
                    level.add(temp.val);
                } else {
                    level.add(0, temp.val);
                }

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }

            ans.add(level);
            leftToRight = !leftToRight;
        }

        return ans;
    }
}
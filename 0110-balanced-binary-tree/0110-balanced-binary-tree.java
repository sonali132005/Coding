class Solution {
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftAns = 1 + height(root.left);
        int rightAns = 1 + height(root.right);

        if (Math.abs(leftAns - rightAns) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
}
package problems;

import common.TreeNode110;

public class Problem110 {
    public boolean isBalanced(TreeNode110 root) {
        if (root == null) {
            return true;
        }

        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        return left && right;
    }

    private int height(TreeNode110 node) {
        if (node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        return 1 + Math.max(left, right);
    }
}

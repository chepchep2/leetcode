package problems;

import common.TreeNode235;

public class Problem235 {
    public TreeNode235 lowestCommonAncestor(TreeNode235 root, TreeNode235 p, TreeNode235 q) {
        TreeNode235 current = root;

        while (current != null) {
            if (p.val < current.val && q.val < current.val) {
                current = current.left;
            } else if (p.val > current.val && q.val > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }
}

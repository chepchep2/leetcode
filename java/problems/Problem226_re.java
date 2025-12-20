package problems;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem226_re {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // BFS
        // 너비 우선 탐색
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                 queue.add(node.left);
             }

             if (node.right != null) {
                 queue.add(node.right);
             }
        }

        // DFS
        // 깊이 우선 탐색
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

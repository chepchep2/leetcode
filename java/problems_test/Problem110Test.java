package problems_test;

import common.TreeNode110;
import problems.Problem110;

public class Problem110Test {
    public static void main(String[] args) {
        Problem110 sol = new Problem110();

        System.out.println("Test 1: root = [3,9,20,null,null,15,7]");
        TreeNode110 root1 = buildTree1();
        System.out.println("Expected: true, Got: " + sol.isBalanced(root1));

        System.out.println("Test 2: root = [1,2,2,3,3,null,null,4,4]");
        TreeNode110 root2 = buildTree2();
        System.out.println("Expected: false, Got: " + sol.isBalanced(root2));

        System.out.println("Test 3: root = []");
        System.out.println("Expected: true, Got: " + sol.isBalanced(null));
    }

    private static TreeNode110 buildTree1() {
        TreeNode110 root = new TreeNode110(3);
        root.left = new TreeNode110(9);
        root.right = new TreeNode110(20);
        root.right.left = new TreeNode110(15);
        root.right.right = new TreeNode110(7);
        return root;
    }

    private static TreeNode110 buildTree2() {
        TreeNode110 root = new TreeNode110(1);
        root.left = new TreeNode110(2);
        root.right = new TreeNode110(2);
        root.left.left = new TreeNode110(3);
        root.left.right = new TreeNode110(3);
        root.left.left.left = new TreeNode110(4);
        root.left.left.right = new TreeNode110(4);
        return root;
    }
}
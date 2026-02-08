package problems_test;

import common.TreeNode235;
import problems.Problem235;

public class Problem235Test {
    public static void main(String[] args) {
        Problem235 sol = new Problem235();

        System.out.println("Test 1: p=2, q=4");
        TreeNode235 root1 = buildTree1();
        TreeNode235 p1 = root1.left;
        TreeNode235 q1 = root1.left.right;
        TreeNode235 result1 = sol.lowestCommonAncestor(root1, p1, q1);
        System.out.println("Expected: 2");
        System.out.println("Got:      " + result1.val);
        System.out.println();

        System.out.println("Test 2: p=2, q=8");
        TreeNode235 root2 = buildTree1();
        TreeNode235 p2 = root2.left;
        TreeNode235 q2 = root2.right;
        TreeNode235 result2 = sol.lowestCommonAncestor(root2, p2, q2);
        System.out.println("Expected: 6");
        System.out.println("Got:      " + result2.val);
        System.out.println();

        System.out.println("Test 3: p=3, q=5");
        TreeNode235 root3 = buildTree1();
        TreeNode235 p3 = root3.left.right.left;
        TreeNode235 q3 = root3.left.right.right;
        TreeNode235 result3 = sol.lowestCommonAncestor(root3, p3, q3);
        System.out.println("Expected: 4");
        System.out.println("Got:      " + result3.val);
        System.out.println();

        System.out.println("Test 4: p=0, q=5");
        TreeNode235 root4 = buildTree1();
        TreeNode235 p4 = root4.left.left;
        TreeNode235 q4 = root4.left.right.right;
        TreeNode235 result4 = sol.lowestCommonAncestor(root4, p4, q4);
        System.out.println("Expected: 2");
        System.out.println("Got:      " + result4.val);
        System.out.println();

        System.out.println("Test 5: p=1, q=3");
        TreeNode235 root5 = buildTree2();
        TreeNode235 p5 = root5.left;
        TreeNode235 q5 = root5.right;
        TreeNode235 result5 = sol.lowestCommonAncestor(root5, p5, q5);
        System.out.println("Expected: 2");
        System.out.println("Got:      " + result5.val);
        System.out.println();
    }

    private static TreeNode235 buildTree1() {
        TreeNode235 root = new TreeNode235(6);
        root.left = new TreeNode235(2);
        root.right = new TreeNode235(8);

        root.left.left = new TreeNode235(0);
        root.left.right = new TreeNode235(4);

        root.right.left = new TreeNode235(7);
        root.right.right = new TreeNode235(9);

        root.left.right.left = new TreeNode235(3);
        root.left.right.right = new TreeNode235(5);
        return root;
    }

    private static TreeNode235 buildTree2() {
        TreeNode235 root = new TreeNode235(2);
        root.left = new TreeNode235(1);
        root.right = new TreeNode235(3);
        return root;
    }
}

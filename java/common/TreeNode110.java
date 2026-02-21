package common;

public class TreeNode110 {
    public int val;
    public TreeNode110 left;
    public TreeNode110 right;
    public TreeNode110() {}
    public TreeNode110(int val) {
        this.val = val;
    }
    TreeNode110(int val, TreeNode110 left, TreeNode110 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

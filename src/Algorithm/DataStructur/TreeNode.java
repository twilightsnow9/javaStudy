package Algorithm.DataStructur;

public class TreeNode {
    private int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(TreeNode left, int val,TreeNode right) {
        this.left = left;
        this.val = val;
        this.right = right;
    }


}

package Algorithm.DataStructur.binaryTree;

public class TreeNode {
    public int val; //节点值
    public TreeNode left; //做孩子
    public TreeNode right; //右孩子
    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(TreeNode left, int val,TreeNode right) {
        this.left = left;
        this.val = val;
        this.right = right;
    }
}

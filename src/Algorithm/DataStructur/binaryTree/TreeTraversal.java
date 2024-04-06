package Algorithm.DataStructur.binaryTree;

public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                new TreeNode(new TreeNode(4),2,new TreeNode(5)),
                1,
                new TreeNode(null,3,new TreeNode(6))
        );
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
    }
    //        前序遍历
    static void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

//    后序遍历
    static void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.val + " ");
    }
//   中序遍历
    static void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
}

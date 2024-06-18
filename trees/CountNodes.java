package trees;

public class CountNodes {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    int count = 0;

    void inorder(TreeNode root) { // inroder traversal
        if (root == null)
            return;
        count++;
        inorder(root.left);
        inorder(root.right);
    }

    public int countNodes(TreeNode root) {
        inorder(root);
        return count;
    }
}
package trees.path;

public class AllPathSum {
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

    int sum = 0;

    public int sumNumbers(TreeNode root) {
        return helper(root, sum);
    }

    public int helper(TreeNode root, int sum) {
        if (root == null) {
            return sum = sum + 0;
        }
        sum = (10 * sum) + root.val;
        return helper(root.left, sum) + helper(root.right, sum);
    }
}

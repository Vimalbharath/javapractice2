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
// class Solution {
// public int countNodes(TreeNode root) {
// if(root==null) return 0;
// int lh = heightLeft(root);
// int rh = heightRight(root);
// if(lh==rh){
// return ((2<<lh)-1);
// }
// else return 1+countNodes(root.left)+countNodes(root.right);
// }

// int heightLeft(TreeNode root){
// int lh = 0;
// while(root.left!=null){
// lh++;
// root=root.left;
// }
// return lh;
// }

// int heightRight(TreeNode root){
// int rh = 0;
// while(root.right!=null){
// rh++;
// root=root.right;
// }
// return rh;
// }

// }
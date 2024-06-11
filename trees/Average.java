package trees;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public /**
        * Definition for a binary tree node.
        * public class TreeNode {
        * int val;
        * TreeNode left;
        * TreeNode right;
        * TreeNode() {}
        * TreeNode(int val) { this.val = val; }
        * TreeNode(int val, TreeNode left, TreeNode right) {
        * this.val = val;
        * this.left = left;
        * this.right = right;
        * }
        * }
        */
class Average {
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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            // int avgLevel = 0;
            double sum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                sum = sum + currentNode.val;
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(sum / levelSize);
        }
        return result;

    }
}
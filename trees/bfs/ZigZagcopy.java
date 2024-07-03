package trees.bfs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagcopy {
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int sizee = queue.size();
            if (!reverse) {
                for (int i = 0; i < sizee; i++) {
                    TreeNode node = queue.pollFirst();

                    if (node.left != null) {
                        queue.offerLast(node.left);
                    }
                    if (node.right != null) {
                        queue.offerLast(node.right);
                    }

                    level.add(node.val);
                }
            } else {
                for (int i = 0; i < sizee; i++) {
                    TreeNode node = queue.pollLast();
                    if (node.right != null) {
                        queue.offerFirst(node.right);
                    }

                    if (node.left != null) {
                        queue.offerFirst(node.left);
                    }

                    level.add(node.val);
                }
            }

            result.add(level);
            reverse = !reverse;
        }

        return result;
    }
}

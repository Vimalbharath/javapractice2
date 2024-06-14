package trees;

public class Kthsmall {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    public static Node root;
    int count = 0;

    public int kthSmallest(Node root, int k) {

        return (helper(root, k).value);
    }

    public Node helper(Node root, int k) {
        if (root == null) {
            return null;
        }
        Node left = helper(root.left, k);

        if (left != null) {
            return left;
        }
        count++;
        if (count == k) {
            return root;
        }
        return helper(root.right, k);
    }
}

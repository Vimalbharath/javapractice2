package practice3.trees;

public class AVL {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public Node() {

        }

        public int getValue() {
            return value;
        }
    }

    public Node root;

    public int height(Node root) {
        if (root == null) {
            return -1;
        }
        return root.height;
    }

    public void display(Node root) {
        if (root.left != null) {
            System.out.println();
        }
    }

    public void populate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }

    public Node insert(int value) {
        return insert(value, root);

    }

    private Node insert(int value, Node node) {
        if (node == null) {
            Node temp = new Node(value);
            return temp;
        }
        if (node.value > value) {
            Node left = insert(value, node.left);
        }
        if (node.value < value) {
            Node right = insert(value, node.right);
        }
        return node;
    }

    public void inorder() {
        inorder(root);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        inorder(root.left);
        inorder(root.right);
    }

    public static void main(String[] args) {
        AVL tree = new AVL();
        int arr[] = { 1, 2, 3, 4, 5 };
        tree.populate(arr);
        tree.inorder();

    }

}

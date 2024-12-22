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

    public AVL() {

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
        System.out.println("hi");

        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (node.value > value) {
            node.left = insert(value, node.left);
        }
        if (node.value < value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(node.left.height, node.right.height) + 1;
        System.out.println(node.value);
        return node;
    }

    public void inorder() {
        inorder(root);

    }

    public void inorder(Node node) {
        System.out.println("bye");
        if (node == null) {
            System.out.println("not inserted");
            return;
        }
        System.out.println(node.value);
        inorder(node.left);
        inorder(node.right);
    }

    public static void main(String[] args) {
        AVL tree = new AVL();
        int arr[] = { 1, 2, 3, 4, 5 };
        tree.populate(arr);
        tree.insert(0);
        tree.inorder();

    }

}

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

}

package linkedlist;

public class SingleLL {
    class Node {
        private int val;
        private Node next;
        private Node head = null;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        void addFirst(int val) {
            Node node = new Node(val);
            if (head == null) {
                head = node;
            }
            node.next = head;
            head = node;

        }
    }

    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        System.out.println(list);
    }

}

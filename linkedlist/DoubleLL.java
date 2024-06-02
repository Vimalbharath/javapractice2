package linkedlist;

public class DoubleLL {
    private Node head;
    private int size;

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }

    }

    public DoubleLL() {
        this.size = 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size = size + 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        list.addFirst(1);
        list.addFirst(2);
        list.display();
    }

}

package linkedlist;

public class SingleLL2 {
    private Node head = null;
    private int size = 0;

    class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

    }

    void addFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            size = size + 1;
        } else {
            node.next = head;
            head = node;
            size = size + 1;
        }

        // System.out.println(size);

    }

    void addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            size = size + 1;
        } else {
            Node temp = head;
            Node last = temp;
            while (temp != null) {
                last = temp;
                temp = temp.next;

            }
            last.next = node;
            size = size + 1;
        }

        // System.out.println(size);

    }

    public void display(Node head) {
        Node temp = head;
        // for (int i = size; i > 0; i--) {
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;

        }

        System.out.print("END");

        System.out.println();

    }

    public static void main(String[] args) {
        SingleLL2 list = new SingleLL2();
        list.addFirst(21);
        // list.display(list.head);
        list.addFirst(22);
        list.addFirst(23);
        list.addLast(20);
        list.display(list.head);
        // System.out.println(list);
    }

}

package linkedlist;

public class SingleLL2 {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    SingleLL2() {
        size = 0;
    }

    public void addFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;

        }

        size = size + 1;

        // System.out.println(size);

    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            size = size - 1;
            return;
        }

        if (head.next != null) {
            head = head.next;

            size = size - 1;
        }

        System.out.println(size);

    }

    public void deleteLast() {
        if (head == null) {
            return;
        }

        Node temp = findNode(size - 1);
        tail = temp;
        tail.next = null;
        size = size - 1;

    }

    void addLast(int val) {

        if (tail == null) {
            addFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size + 1;

        // System.out.println(size);

    }

    void add(int val, int index) {

        if (index == 0) {
            addFirst(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {

            temp = temp.next;

        }
        Node node = new Node(val, temp.next);

        temp.next = node;
        size = size + 1;
    }

    // System.out.println(size);

    public Node findNode(int index) {
        Node temp = head;

        for (int i = 1; i < index; i++) {

            temp = temp.next;

        }
        return temp;

    }

    public void display() {
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
        list.add(100, 2);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.display();
        // System.out.println(list);
    }

}

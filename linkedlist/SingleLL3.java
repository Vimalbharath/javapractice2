package linkedlist;

public class SingleLL3 {
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

    SingleLL3() {
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

    public int deleteFirst() {
        if (head == null) {
            return 0;
        }
        int val = head.val;

        head = head.next;
        if (head == null) {
            tail = head;
        }

        size = size - 1;
        return val;

    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node temp = findNode(size - 1);
        int val = tail.val;
        tail = temp;
        tail.next = null;
        size = size - 1;
        return val;

    }

    public int deleteAt(int index) {

        if (index <= 1) {
            return deleteFirst();
        }
        if (index == size) {
            return deleteLast();
        }

        Node temp = findNode(index - 1);
        int val = temp.next.val;
        temp.next = temp.next.next;
        size = size - 1;
        return val;

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

    public Node findNodeByVal(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.val == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;

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
        SingleLL3 list = new SingleLL3();
        list.addFirst(21);
        // list.display(list.head);
        list.addFirst(22);
        list.addFirst(23);
        list.addLast(20);
        list.add(100, 2);
        list.display();
        System.out.println(list.deleteFirst());

        System.out.println(list.deleteLast());
        System.out.println(list.deleteAt(2));
        list.deleteAt(1);
        list.deleteAt(1);
        list.display();
        // System.out.println(list);
    }

}

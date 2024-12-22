package practice3.linked;

public class Single {

    public class Node {
        int value;
        Node next;

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public Node head;
    public Node tail;
    public int size;

    public Single() {
        this.size = 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        size = size + 1;
        if (head == null) {
            head = node;
            tail = head;
            return;
        }
        node.next = head;
        head = node;

    }

    public void addLast(int value) {
        Node node = new Node(value);
        size = size + 1;
        if (head == null) {
            head = node;
            tail = head;
            return;
        }
        tail.next = node;
        tail = node;

    }

    public void addatindex(int value, int index) {
        Node node = new Node(value);
        if (index > size) {
            System.out.println("Enter correct index");
            return;
        }

        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        // swap
        size = size + 1;

    }

    public int deletefirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size = size - 1;
        return val;
    }

    public int deletelast() {
        // System.out.println(size);
        if (size == 1) {

            return deletefirst();
        }
        int val = head.value;
        // Node prev = prevnode(size);
        Node prev = getnode(size - 2);
        tail = prev;
        tail.next = null;
        size = size - 1;
        return val;
    }

    public Node prevnode(int size) {
        Node node = head;
        if (node == null) {
            System.out.println("empty");
            return node;
        }
        if (size == 1) {
            return null;
        }
        for (int i = 1; i < size - 1; i++) {
            node = node.next;
        }
        return node;

    }

    public Node getnode(int size) {
        Node node = head;

        for (int i = 1; i < size - 1; i++) {
            node = node.next;
        }
        return node;

    }

    public void display() {
        Node node = head;
        while (node != null) {

            System.out.print(node.value);
            System.out.print("->");
            node = node.next;
        }

        System.out.print("NULL");

    }

    public static void main(String[] args) {
        Single ll = new Single();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addatindex(5, 2);
        // ll.display();
        ll.deletefirst();
        ll.display();
        ll.deletelast();
        ll.deletelast();
        ll.deletelast();
        ll.deletelast();
        ll.display();
    }
}

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
        size = size + 1;
        if (head == null) {
            head = node;
            tail = head;
            return;
        }
        if (index == size) {
            tail.next = node;
            tail = node;
            return;
        }
        Node temp = head;
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        node = temp.next;

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
        ll.addatindex(5, 5);
        ll.display();
    }
}

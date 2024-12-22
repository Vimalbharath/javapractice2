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
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
        size = size + 1;

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
        ll.display();
    }
}

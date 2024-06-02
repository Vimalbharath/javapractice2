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
            size = size + 1;
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

    public void displayrev() {
        Node temp = head;
        Node last = temp;
        while (temp != null) {
            last = temp;
            temp = temp.next;
        }
        while (last != null) {

            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.print("START");
        System.out.println();

    }

    public void addAfter(int value, int after) {
        Node prev = find(after);
        if (prev == null) {
            return;
        }
        Node node = new Node(value);
        if (prev.next != null) {
            prev.next.prev = node;

        }
        node.next = prev.next;
        node.prev = prev;
        prev.next = node;
    }

    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val) {
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("Node not found");
        return null;
    }

    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addAfter(100, 2);
        list.display();
        list.displayrev();
    }

}

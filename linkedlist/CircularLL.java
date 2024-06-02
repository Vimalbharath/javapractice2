package linkedlist;

public class CircularLL {
    private Node head;
    private Node tail;

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

    public CircularLL() {

    }

    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;

    }

    private void display() {
        Node temp = head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;

        } while (temp.val != head.val);
        System.out.print("START");
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.display();
    }

}

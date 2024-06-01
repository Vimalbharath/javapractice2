package linkedlist;

public class SingleLL1 {
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

        System.out.println(size);

    }

    public void display(Node head) {
        Node temp = head;
        for (int i = size; i > 0; i--) {
            System.out.println(temp.val);
            temp = temp.next;

        }

    }

    public static void main(String[] args) {
        SingleLL1 list = new SingleLL1();
        list.addFirst(21);
        // list.display(list.head);
        list.addFirst(22);
        list.addFirst(23);
        list.display(list.head);
        // System.out.println(list);
    }

}

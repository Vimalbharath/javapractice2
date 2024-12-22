package practice3.linked;

public class CustomStack {
    public int[] data;
    public static final int DEFAULT_SIZE = 5;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack empty");
            return -1;
        }
        return data[ptr--];
    }

    public boolean isFull() {
        if (ptr == data.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (ptr == -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

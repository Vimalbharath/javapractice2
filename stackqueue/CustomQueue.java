package stackqueue;

public class CustomQueue {
    protected int[] data;
    public int ptr = -1;
    private static final int DEFAULT_SIZE = 10;

    CustomQueue() {
        this(DEFAULT_SIZE);
    }

    CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        int ans = data[0];
        int[] temp = new int[data.length];
        for (int i = 1; i < data.length; i++) {
            temp[i - 1] = data[i];

        }
        data = temp;
        return ans;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) throws Exception {
        CustomQueue stack = new CustomQueue(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}

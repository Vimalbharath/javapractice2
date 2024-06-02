package stackqueue;

public class CustomStack {
    public int ptr = -1;
    private static final int DEFAULT_SIZE = 10;

    CustomStack() {
        super(DEFAULT_SIZE);
    }

    CustomStack(int size) {
        int[] data = new int[size];
    }
}
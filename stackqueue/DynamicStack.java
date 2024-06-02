package stackqueue;

public class DynamicStack extends CustomStack {

    @Override
    public boolean push(int item) {
        if (isFull()) {
            int[] temp = new int[ptr * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
                data = temp;
            }
        }
        return super.push(item);
    }

    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());
    }
}

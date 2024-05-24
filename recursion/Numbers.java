package recursion;

public class Numbers {
    public static void main(String[] args) {
        numbers(5);
    }

    private static void numbers(int i) {
        if (i == 0) {
            return;
        }

        numbers(i - 1);

        System.out.println(i);
    }
}
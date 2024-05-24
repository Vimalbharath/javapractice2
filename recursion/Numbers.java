package recursion;

public class Numbers {
    public static void main(String[] args) {
        numbers(5);
    }

    private static void numbers(int i) {
        if (i == 0) {
            return;
        }
        System.out.println(i);
        numbers(i - 1);
    }
}
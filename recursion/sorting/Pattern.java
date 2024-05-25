package recursion.sorting;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Hello");
        pattern1(5);
    }

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

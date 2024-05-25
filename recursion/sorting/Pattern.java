package recursion.sorting;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Hello");
        pattern1(5);
        pattern2(5, 0);
    }

    private static void pattern2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            pattern2(r, c + 1);
        } else {
            System.out.println();
            pattern2(r - 1, 0);
        }

    }

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

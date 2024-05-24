package recursion;

public class Fibbo {
    public static void main(String[] args) {
        int ans = fibbo(5);
        System.out.println(ans);
    }

    private static int fibbo(int i) {
        if (i < 2) {
            return i;
        }
        return fibbo(i - 2) + fibbo(i - 1);
    }
}

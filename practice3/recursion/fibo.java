package practice3.recursion;

public class fibo {
    public static void main(String[] args) {
        int ans = fibbo(5);
        System.out.println(ans);
    }

    public static int fibbo(int n) {
        if (n < 2) {
            return n;
        }
        return n + fibbo(n - 1);
    }
}

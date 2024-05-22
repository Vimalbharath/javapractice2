package basics;

public class Prime {

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Hello, it is " + Primenumber(n));
    }

    public static boolean Primenumber(int n) {
        // int count=0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                // count++;
                return false;
            }
        }
        return true;
    }
}
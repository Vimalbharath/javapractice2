package basics;

public class Prime2 {

    public static void main(String[] args) {
        int n = 1000;
        System.out.println("The Prime numbers are:  ");
        for (int i = 2; i < n; i++) {
            if (Primenumber(i) == true) {
                System.out.println(i);
            }
        }

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
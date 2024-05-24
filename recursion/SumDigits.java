package recursion;

public class SumDigits {
    public static void main(String[] args) {
        int ans = sumofdigits(4664);
        System.out.println(ans);
    }

    private static int sumofdigits(int i) {
        if (i == 0) {
            return 0;
        }
        int ans = i % 10 + sumofdigits(i / 10);
        return ans;
    }
}

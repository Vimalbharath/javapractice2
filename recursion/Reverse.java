package recursion;

public class Reverse {
    public static void main(String[] args) {
        int ans = reversenum1(14664);
        System.out.println(ans);
    }

    private static int reversenum1(int i) {
        int ans = 0;
        while (i > 0) {
            ans = ans * 10 + i % 10;
            i = i / 10;
        }

        return ans;
    }

    private static int reversenum(int i) {
        if (i == 0) {
            return 0;
        }
        int ans = i % 10 + 10 * reversenum(i / 10);
        return ans;
    }
}

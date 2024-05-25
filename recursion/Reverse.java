package recursion;

public class Reverse {
    public static void main(String[] args) {
        int ans = reversenum3(14664);
        System.out.println(ans);
    }

    private static int reversenum3(int i) {
        int noofdigits = (int) Math.log10(i) + 1;
        return helper(i, noofdigits);
    }

    private static int helper(int i, int noofdigits) {

        if (i == 0) {
            return ans;
        }
        int ans=(i % 10)*10 power noofdigits+helper (i/10,noofdigits - 1);
        return ans;
    }

    private static int reversenum1(int i) {
        int ans = 0;
        while (i > 0) {
            ans = ans * 10 + i % 10;
            i = i / 10;
        }

        return ans;
    }

    static int answer = 0;

    private static int reversenum2(int i) {
        if (i == 0) {
            return answer;
        }
        answer = (answer * 10) + i % 10;
        return reversenum2(i / 10);
    }

    private static int reversenum(int i) {
        if (i == 0) {
            return 0;
        }
        int ans = i % 10 + 10 * reversenum(i / 10);
        return ans;
    }
}

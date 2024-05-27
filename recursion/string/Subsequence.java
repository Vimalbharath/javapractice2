package recursion.string;

public class Subsequence {
    public static void main(String[] args) {
        sequence("", "abc");
    }

    private static void sequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sequence(p + ch, up.substring(1));
        sequence(p, up.substring(1));
    }
}

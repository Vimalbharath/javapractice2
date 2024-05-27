package recursion.string;

public class SkipOne {
    public static void main(String[] args) {
        String up = "ababababa";
        System.out.println(up.substring(1));
        char ch = up.charAt(0);
        System.out.println(ch);
        System.out.println(skipletter(up));
    }

    private static String skipletter(String up) {
        if (up.isEmpty()) {

            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {

            return skipletter(up.substring(1));
        }

        return ch + skipletter(up.substring(1));

    }
}

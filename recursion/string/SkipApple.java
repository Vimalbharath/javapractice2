package recursion.string;

public class SkipApple {
    public static void main(String[] args) {
        String up = "abacapplecbababa";
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
        if (up.startsWith("apple")) {

            return skipletter(up.substring(5));
        }

        return ch + skipletter(up.substring(1));

    }
}

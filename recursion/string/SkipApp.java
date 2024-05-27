package recursion.string;

public class SkipApp {
    public static void main(String[] args) {
        String up = "appbacapplecbababa";
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
        if (up.startsWith("app") && !up.startsWith("apple")) {

            return skipletter(up.substring(5));
        }

        return ch + skipletter(up.substring(1));

    }
}

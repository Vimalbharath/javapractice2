package recursion.string;

public class Skip {
    public static void main(String[] args) {
        String up = "ababababa";
        System.out.println(up.substring(1));
        char ch = up.charAt(0);
        System.out.println(ch);
        skipletter("", up);
    }

    private static void skipletter(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            up = up.substring(1);

            skipletter(p, up);
        } else {
            up = up.substring(1);
            p = p + ch;
            skipletter(p, up);
        }

    }
}

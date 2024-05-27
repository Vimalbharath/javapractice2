package recursion.string;

public class Skip {
    public static void main(String[] args) {
        skipletter("", "hfkakjfhaaafa");
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
        }
        up = up.substring(1);
        p = p + ch;
        skipletter(p, up);

    }
}

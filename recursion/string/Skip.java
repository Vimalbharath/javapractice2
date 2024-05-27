package recursion.string;

public class Skip {
    public static void main(String[] args) {
        skipletter("hfkakjfhaaafa");
    }

    private static void skipletter(String up) {
        if (up.isEmpty()) {
            System.out.println(up);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            up = up.substring(1);
        }
        up = ch + up.substring(1);
    }
}

package recursion.string;

public class Permutation {
    public static void main(String[] args) {
        permut("", "abc");
    }

    private static void permut(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < up.length(); i++) {

            // p = up.substring(0, i) + ch;
            p = up.substring(0, i) + ch + up.substring(i, up.length());
            System.out.println(p);
            // p = up.substring(i) + ch;

        }
    }
}

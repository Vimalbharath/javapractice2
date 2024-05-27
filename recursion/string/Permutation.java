package recursion.string;

public class Permutation {
    public static void main(String[] args) {
        permut("", "a");
    }

    private static void permut(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        // up = up.substring(1);
        for (int i = 0; i < p.length(); i++) {

            p = p + (ch + up.charAt(i));

            System.out.println(p);
        }
    }
}

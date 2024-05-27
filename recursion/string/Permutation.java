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
        p = p + up.charAt(0);
        up = up.substring(1);
        for (int i = 0; i < p.length(); i++) {
            permut(p, up);
        }
    }
}

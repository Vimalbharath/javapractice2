package recursion.string;

public class PermutationCount {
    public static void main(String[] args) {
        int ans = permut("", "abc");
        System.out.println(ans);
    }

    private static int permut(String p, String up) {
        if (up.isEmpty()) {
            // System.out.println(p);
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            count = count + permut(f + ch + s, up.substring(1));

            // p = up.substring(0, i) + ch;
            // p = up.substring(0, i) + ch + up.substring(i, up.length());
            // System.out.println(p);
            // p = up.substring(i) + ch;

        }
        return count;
    }
}

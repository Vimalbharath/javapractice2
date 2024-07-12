package daily;

public class Stringab {

    public int maximumGain(String s, int x, int y) {
        // if (s.length() == 0) {
        // return Math.max(x, y);
        // }
        // char ch = s.charAt(0);
        String up = s;
        // String p = "";
        int ans = 0;
        return skipletter(up, x, y, ans);

    }

    public int skipletter(String up, int x, int y, int ans) {
        if (up.isEmpty()) {

            return ans;
        }
        // char ch = up.charAt(0);
        if (up.startsWith("ab")) {

            return skipletter(up.substring(2), x, y, ans + x);
        }
        if (up.startsWith("ba")) {

            return skipletter(up.substring(2), x, y, ans + y);
        }

        return ans;
    }
}
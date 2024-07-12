package daily;

public class Stringab {

    public int maximumGain(String s, int x, int y) {
        // if (s.length() == 0) {
        // return Math.max(x, y);
        // }
        // char ch = s.charAt(0);
        String up = s;
        // String p = "";
        return skipletter(up, 0, 0);

    }

    public int skipletter(String up, int x, int y) {
        if (up.isEmpty()) {

            return Math.max(x, y);
        }
        // char ch = up.charAt(0);
        if (up.startsWith("ab")) {

            return skipletter(up.substring(2), x + 1, y);
        }
        if (up.startsWith("ba")) {

            return skipletter(up.substring(2), x, y + 1);
        }

        return Math.max(x, y);
    }
}
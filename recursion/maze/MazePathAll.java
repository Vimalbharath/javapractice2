package recursion.maze;

public class MazePathAll {
    public static void main(String[] args) {

        boolean[][] box = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };
        path(0, 0, "", box);
        // System.out.println(ans);
    }

    private static void path(int r, int c, String ch, boolean[][] box) {
        if (r == box.length - 1 && c == box[0].length - 1) {
            System.out.println(ch);
            return;
        }
        // String ch = "";

        if (box[c][r]) {
            box[c][r] = false;
            if (r < box.length - 1) {
                path(r + 1, c, ch + "D", box);
            }
            if (c < box[0].length - 1) {
                path(r, c + 1, ch + "R", box);
            }
            if (r > 0) {
                path(r - 1, c, ch + "U", box);
            }
            if (c > 0) {
                path(r, c - 1, ch + "L", box);
            }
            box[c][r] = true;
        }

    }
}

package recursion.maze;

public class MazePathAllPic {
    public static void main(String[] args) {

        boolean[][] box = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };

        int[][] path = new int[box.length][box[0].length];
        path(0, 0, "", box, path);
        // System.out.println(ans);
    }

    private static void path(int r, int c, String ch, boolean[][] box, int[][] path) {
        if (r == box.length - 1 && c == box[0].length - 1) {
            System.out.println(ch);

            for (int i = 0; i < path.length; i++) {
                for (int j = 0; j < path[i].length; j++) {
                    System.out.print(" " + path[i][j]);
                }
                System.out.println();

            }
            System.out.println();
            return;
        }
        // String ch = "";

        if (box[c][r]) {
            box[c][r] = false;
            if (r < box.length - 1) {
                path(r + 1, c, ch + "D", box, path);
            }
            if (c < box[0].length - 1) {
                path(r, c + 1, ch + "R", box, path);
            }
            if (r > 0) {
                path(r - 1, c, ch + "U", box, path);
            }
            if (c > 0) {
                path(r, c - 1, ch + "L", box, path);
            }
            box[c][r] = true;
        }

    }
}

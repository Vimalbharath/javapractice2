package recursion.maze;

public class MazePathAllPic {
    public static void main(String[] args) {

        boolean[][] box = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };

        int[][] path = new int[box.length][box[0].length];
        path(0, 0, "", box, path, 1);
        // System.out.println(ans);
    }

    private static void path(int r, int c, String ch, boolean[][] box, int[][] path, int sum) {
        if (r == box.length - 1 && c == box[0].length - 1) {
            path[c][r] = sum;
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
            path[c][r] = sum;
            box[c][r] = false;
            if (r < box.length - 1) {
                path(r + 1, c, ch + "R", box, path, sum + 1);
            }
            if (c < box[0].length - 1) {
                path(r, c + 1, ch + "D", box, path, sum + 1);
            }
            if (r > 0) {
                path(r - 1, c, ch + "L", box, path, sum + 1);
            }
            if (c > 0) {
                path(r, c - 1, ch + "U", box, path, sum + 1);
            }
            box[c][r] = true;
            path[c][r] = 0;
        }

    }
}

package recursion.maze;

public class MazePath {
    public static void main(String[] args) {
        path(3, 3, "");
        // System.out.println(ans);
    }

    private static void path(int i, int j, String ch) {
        if (i == 1 && j == 1) {
            System.out.println(ch);
            return;
        }
        // String ch = "";
        if (i > 1) {
            path(i - 1, j, ch + "R");
        }
        if (j > 1) {
            path(i, j - 1, ch + "D");
        }

    }
}

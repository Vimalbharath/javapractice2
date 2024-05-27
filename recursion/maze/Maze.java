package recursion.maze;

public class Maze {
    public static void main(String[] args) {
        int ans = path(3, 3);
        System.out.println(ans);
    }

    private static int path(int i, int j) {
        if (i == 1 || j == 1) {
            return 1;
        }
        int ans = 0;
        ans = ans + path(i - 1, j);
        ans = ans + path(i, j - 1);
        return ans;
    }
}

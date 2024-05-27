package recursion.maze;

import java.util.ArrayList;

public class MazePathArray {
    public static void main(String[] args) {
        ArrayList<String> ans = path(3, 3, "");
        System.out.println(ans);
    }

    private static ArrayList<String> path(int i, int j, String ch) {
        if (i == 1 && j == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ch);
            return list;
        }
        // String ch = "";
        ArrayList<String> fulllist = new ArrayList<>();
        if (i > 1) {
            fulllist.addAll(path(i - 1, j, ch + "R"));
        }
        if (j > 1) {
            fulllist.addAll(path(i, j - 1, ch + "D"));
        }

        return fulllist;

    }
}

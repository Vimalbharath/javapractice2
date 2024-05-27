package recursion.maze;

import java.util.ArrayList;

public class MazePathObstacle {
    public static void main(String[] args) {
        boolean[][] box = {
                { true, true, false },
                { true, true, true },
                { true, true, true },
        };
        ArrayList<String> ans = path(0, 0, "", box);
        System.out.println(ans);
    }

    private static ArrayList<String> path(int i, int j, String p, boolean[][] box) {
        if (i == box.length - 1 && j == box[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // String ch = "";
        ArrayList<String> fulllist = new ArrayList<>();
        if (box[i][j] != false) {

            if (i < box.length - 1) {
                fulllist.addAll(path(i + 1, j, p + "D", box));
            }
            if (j < box[0].length - 1) {
                fulllist.addAll(path(i, j + 1, p + "R", box));
            }
        }
        return fulllist;

    }
}

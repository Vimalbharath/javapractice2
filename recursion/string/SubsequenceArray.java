package recursion.string;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsequenceArray {
    public static void main(String[] args) {
        ArrayList<String> list = sequence("", "abc");
        System.out.println(list);
    }

    private static ArrayList<String> sequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (p != "")
                list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = sequence(p + ch, up.substring(1));
        ArrayList<String> right = sequence(p, up.substring(1));
        left.addAll(right);
        return left;
    }

}

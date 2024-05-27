package recursion.string;

import java.util.ArrayList;

public class PermutationArray {
    public static void main(String[] args) {
        ArrayList<String> list = permut("", "abc");
        System.out.println(list);
    }

    private static ArrayList<String> permut(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();

            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> listfull = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            ArrayList<String> list = (permut(f + ch + s, up.substring(1)));
            listfull.addAll(list);

            // p = up.substring(0, i) + ch;
            // p = up.substring(0, i) + ch + up.substring(i, up.length());
            // System.out.println(p);
            // p = up.substring(i) + ch;

        }
        return listfull;
    }
}

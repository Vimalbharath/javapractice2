package recursion;

import java.util.ArrayList;

public class LinearSearch3 {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 8, 2, 9, 0, 2, 1 };
        int target = 2;
        ArrayList<Integer> list = new ArrayList<>();
        list = linear(arr, target, 0, list);
        System.out.println(list);

    }

    private static ArrayList<Integer> linear(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }

        return linear(arr, target, i + 1, list);
    }

}

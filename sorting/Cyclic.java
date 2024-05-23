package sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != i - 1) {
                swap(arr, i, arr[i]);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

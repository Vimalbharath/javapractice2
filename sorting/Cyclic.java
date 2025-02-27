package sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 9, 3, 4, 6, 7, 2, 1 };
        cyclicsort3(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicsort2(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = i + 1;
            if (arr[i] != correct) {
                swap(arr, i, arr[correct]);
            }
            i++;
        }
    }

    private static void cyclicsort3(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    // failing for { 5, 8, 9, 3, 4, 6, 7, 2, 1 }
    private static void cyclicsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

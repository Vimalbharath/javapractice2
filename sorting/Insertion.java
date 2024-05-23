package sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, -2, 5, 4, 3, 2 };
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

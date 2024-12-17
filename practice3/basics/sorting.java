package practice3.basics;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 9, 3, 4, 6, 7, 2, 1 };
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int max = maxindex(arr, last);
            swap(arr, last, max);
        }
    }

    public static int maxindex(int[] arr, int last) {
        int max = 0;
        for (int i = 1; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void bubblesort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}

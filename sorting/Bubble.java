package sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, -2, 5, 4, 3, 2 };
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (swapped != true) {
                break;
            }
        }
    }
}

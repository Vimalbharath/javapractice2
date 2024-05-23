package basics;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
        arr = bubblesort(arr);
        System.out.println(arr);
    }

    private static int[] bubblesort(int[] arr) {

        int j = arr.length;
        if (j < 2) {
            return arr;
        }
        while (j >= 0) {
            for (int i = 1; i < j; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i, i - 1);
                }
            }
        }
        return arr;

    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;
    }
}
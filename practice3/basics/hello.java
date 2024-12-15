package practice3.basics;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello Vimal");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value:");
        // int x = input.nextInt();
        System.out.println("Enter second value:");
        // int y = input.nextInt();
        sum(5, 6);
        System.out.println("Array:");
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void sum(int i, int j) {
        int sum;
        sum = i + j;
        System.out.println(sum);

    }
}

package practice3.basics;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello Vimal");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value:");
        int x = input.nextInt();
        System.out.println("Enter second value:");
        int y = input.nextInt();
        sum(x, y);
    }

    private static void sum(int i, int j) {
        int sum;
        sum = i + j;
        System.out.println(sum);

    }
}

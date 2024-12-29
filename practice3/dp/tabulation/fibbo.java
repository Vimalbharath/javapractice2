package practice3.dp.tabulation;

public class fibbo {

    public static int fibo(int n) {
        int[] table = new int[n + 1];
        table[1] = 1;
        for (int i = 0; i <= table.length; i++) {
            if (i + 1 < table.length) {
                table[i + 1] += table[i];
            }
            if (i + 2 < table.length) {
                table[i + 2] += table[i];
            }
        }
        return table[n];
    }

    public static void main(String[] args) {
        System.out.println(fibo(45));
    }
}
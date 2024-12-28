package practice3.dp;

import java.util.HashMap;

public class fibbo {

    double result = 0;

    public static int fibo(int n) {
        HashMap<Integer,Double> save=new HashMap<>();
        if(save.get(fibo(n)){

        }
        if (n <= 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(45));
    }

}

package practice3.dp;

import java.util.HashMap;

public class fibbo {

    static double result = 0;

    public static int fibo(int n) {
        HashMap<Integer,Double> memo=new HashMap<>();
        if(memo.){

        }
        if (n <= 1) {
            return 1;
        }
        result=fibo(n - 1) + fibo(n - 2);
        memo.set(n)=result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibo(45));
    }

}

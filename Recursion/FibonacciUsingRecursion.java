package Recursion;

public class FibonacciUsingRecursion {

    public static void fibonacci(int a, int b, int n){
        if(n == 1){
            return;
        }
        int sum = a + b;
        System.out.print(" "+sum);
        fibonacci(b, sum, n-1);
    }

    public static int fibonacciSum(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacciSum(n-1) + fibonacciSum(n-2);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        fibonacci(a, b, 5);
        System.out.println();

        System.out.println(fibonacciSum(5));
    }
}

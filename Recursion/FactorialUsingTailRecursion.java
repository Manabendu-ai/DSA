package Recursion;

public class FactorialUsingTailRecursion {

    public static int fact(int n, int k){
        if(n==0){
            return k;
        }
        return fact(n-1, n*k);
    }

    public static void main(String[] args) {
        System.out.println(fact(8, 1));
    }
}

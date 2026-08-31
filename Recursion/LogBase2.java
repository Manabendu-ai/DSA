package Recursion;
/*
It computes the log base 2 n for the powers of 2 and for non 2 powers it return the floor of the log base 2 n
 */
public class LogBase2 {

    public static int fun(int n){
        if (n == 1){
            return 0;
        }
        return 1+ fun(n/2);
    }

    public static void main(String[] args) {
        System.out.println(fun(36));
    }
}

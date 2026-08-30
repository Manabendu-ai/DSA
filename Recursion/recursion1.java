package Recursion;

public class recursion1 {

    public static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        fun(5);
    }
}
/**

 5
 4
 3
 2
 1
 1
 2
 3
 4
 5

 */
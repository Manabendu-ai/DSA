package Recursion;

public class ReverseOrder {
    public static void printNreverse(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printNreverse(n-1);

    }

    public static void main(String[] args) {
        printNreverse(13);
    }
}

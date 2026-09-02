package Recursion;

public class NaturalNumberUsingTailRecursion {

    public static int sum(int n, int k){
        if(n == 0){
            return k;
        }
        return sum(n-1, k+n);
    }

    public static void main(String[] args) {
        System.out.println(sum(10,0));
    }
}

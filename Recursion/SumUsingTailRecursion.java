package Recursion;

public class SumUsingTailRecursion {
    public static int sum(int n, int k){
        if(n==0){
            return k;
        }
        return sum(n-1, n+k);
    }

    public static void main(String[] args) {
        System.out.println(sum(10,0));
    }
}

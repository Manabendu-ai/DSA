package Recursion;

/**
 Tower of Hanoi problem.

 Rules :
 --> Only move disc moves at a time.
 --> No larger disc above the smaller one.
 --> Only the top disc of the tower can be moved


 Important approach to solve any recursive solution:
 1) Show f(n) works (base case)
 2) Assume f(n-1) works
 3) show f(n) works for f(n-1)
 */


public class TowerOfHanoi {
    public static void toh(int n, int start, int end){
        if(n == 1){
            System.out.println("Move disc 1 from "+start+" to "+end);
            return;
        }
        int other = 6 - (start + end);
        toh(n-1, start, other);
        System.out.println("Move disc "+n+" from "+start+ " to "+end);
        toh(n-1, other, end);
    }

    public static void main(String[] args) {
        int n = 3;
        int start = 1;
        int end = 3;
        toh(n, start, end);
    }
}

package Recursion;

/**
 PS: You are given an n x m matrix. Find the number of ways to reach from top left corner to bottom right corner.
 */
public class LeftRightPaths {

    public static int findPaths(int rows, int cols){
        if(rows == 1 || cols==1){
            return 1;
        }
        return findPaths(rows-1, cols) + findPaths(rows, cols-1);
    }

    public static void main(String[] args) {
        int n = 4, m = 3;
        System.out.println(findPaths(n, m));
    }
}

package Recursion;


public class RopeCuttingProblem {

    public static int maxCuts(int len, int a, int b, int c){
        if(len == 0){
            return 0;
        }
        if (len < 0){
            return -1;
        }
        int res =  Math.max(maxCuts(len-a, a, b, c) ,
                Math.max(maxCuts(len-b, a, b, c) , maxCuts(len - c, a, b, c)));
        if (res==-1){
            return -1;
        }
        return res+1;
    }

    public static void main(String[] args) {
        System.out.println(maxCuts(23,11,9,12));
    }
}
// Time Complexity : O(3^n)
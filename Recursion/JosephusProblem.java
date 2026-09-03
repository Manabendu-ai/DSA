package Recursion;

/**

 This is a very interesting problem:
 n friends are standing in a circle and let's say the person at 0th position has the gun first.
 Now that person must shoot the kth person(including him).
 After shoot the kth person the person next to kth person will get the gun,
 This repeats until there a single person survives till the end who is the winner!

 */
public class JosephusProblem {
    public static int jos(int n, int k){
        if(n == 1){
            return 0;
        }
        return (jos(n-1,k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println(jos(5, 3));
    }
}

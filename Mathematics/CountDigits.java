package Mathematics;

/*

Given a number n, return the count of digits in this number.
Using log base 10 function - O(1) Time and O(1) Space

 */

public class CountDigits {

    public static int count(int n){
        return (int)Math.floor(Math.log10(Math.abs(n))) + 1;
    }
    public static void main(String[] args) {
        int n = 23472;
        System.out.println(count(n));
    }
}

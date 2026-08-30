package Recursion;

public class PalindromeCheck {

    public static boolean isPalindrome(String str, int left, int right){
        if(left >= right){
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left+1, right-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("manam",0,4));
        System.out.println(isPalindrome("abba",0,3));
        System.out.println(isPalindrome("abcd",0,3));
    }
}

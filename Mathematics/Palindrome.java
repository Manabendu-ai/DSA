package Mathematics;

public class Palindrome {
    public static boolean isPalindrome(int n){

        String s = String.valueOf(n);
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 333417333;
        System.out.println(isPalindrome(n));
    }
}

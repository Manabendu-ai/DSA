package Recursion;

public class ReversingString {

    public static String reverse(char[] s, int left, int right){
        if(left >= right){
            return String.valueOf(s);
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        return reverse(s, left+1, right-1);
    }

    public static void main(String[] args) {
        String name = "manabendu";
        String rev = reverse(name.toCharArray(), 0, name.length()-1);
        System.out.println(rev);
    }
}

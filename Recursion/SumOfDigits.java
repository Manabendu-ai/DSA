package Recursion;

public class SumOfDigits {

    public static int sum(int[] nums, int start){
        if(start == nums.length){
            return 0;
        }
        return nums[start] + sum(nums, start+1);
    }

    public static void main(String[] args) {
        int[] nums = {18,9,3,12,8};
        System.out.println(sum(nums, 0));
    }
}

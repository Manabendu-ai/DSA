package Recursion;

public class BinarySearchUsingRecursion {

    public static int binarySearch(int[] arr, int l, int r, int target){
        if(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                return binarySearch(arr, l, mid-1, target);
            } else{
                return binarySearch(arr, mid+1,  r, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,8,17,23,61,88,92,119};
        int target = 61;
        int index = binarySearch(arr, 0, arr.length-1, target);
        System.out.println(index);
    }
}

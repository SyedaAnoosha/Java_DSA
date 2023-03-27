package Recursion;

public class BinarySearch {

    public static int binarySearch(int[] a, int l, int h, int x) {

        if (l < h) {
            int mid = (l + h)/2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                return binarySearch(a, mid+1, h, x);
            } else {
                return binarySearch(a, l, mid-1, x);
            }
        }

        return -1; //element not found
    }

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,0,arr.length-1,0));
        System.out.println(binarySearch(arr,0,arr.length-1,4));
    }
}
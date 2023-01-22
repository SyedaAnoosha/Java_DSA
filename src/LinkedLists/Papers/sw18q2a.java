package LinkedLists.Papers;
class BinarySearch{
    public int binarySearch(int[] arr, int key, int first, int last){
        int mid = first + last/2;
        while (first<=last){
            if(arr[mid]==key){
                return mid;
            } else if (key > arr[mid]) {
                first = mid +1  ;
            } else {
                last = mid-1;
            }
            mid = first + last/2;
        }
        return -1;
    }
}
public class sw18q2a {
    public static void main(String[] args) {
        int[] arr = {1,15,33,42,43,45,67,73,75,77,89,95};
        int key1 = 95;
        int key2 = 47;

        BinarySearch B = new BinarySearch();
        System.out.println(B.binarySearch(arr,key1,0,arr.length-1));
        System.out.println(B.binarySearch(arr,key2,0,arr.length-1));
    }
}

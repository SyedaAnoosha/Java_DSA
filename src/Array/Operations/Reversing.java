package Array.Operations;
import java.util.Arrays;

class Practice{
    public int[] reverse(int[] arr){
        int start = 0, end = arr.length-1, temp;
        while(start<=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

}
public class Reversing {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        Practice P = new Practice();
        System.out.println(Arrays.toString(P.reverse(arr)));
    }
}

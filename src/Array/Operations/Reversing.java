package Array.Operations;
import java.util.Arrays;

class Practice{
    public int[] reverse(int[] arr){
        int temp;
        for(int i = 0, j = arr.length-1 ; i<arr.length/2 ; i++, j--){
            temp=arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
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

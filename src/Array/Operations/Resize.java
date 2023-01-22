package Array.Operations;
import java.util.Arrays;

public class Resize {

    public static int[] resize(int[] arr, int x){
        if(x<arr.length)
            throw  new IllegalArgumentException();

        int [] aa = new int[x];

        System.arraycopy(arr,0,aa,0,arr.length);
        return aa;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        System.out.println(Arrays.toString(resize(a,8)));

    }
}
package Arrays.Sorting;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={10,6,86,381,100,94,67,34,26,2,7,90,23,43,0,1};
        Sorting_Algorithms S = new Sorting_Algorithms();
         /* S.Selection_Sort(arr);
         S.Bubble_sort(arr);
         S.Insertion_sort(arr);*/
        S.QuickSort1D(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
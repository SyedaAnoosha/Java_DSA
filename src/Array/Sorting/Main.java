package Array.Sorting;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={10,6,86,381,100,94};
        int[] arr2={67,34,26,2,7,90,23,43,0};
        Sorting_Algorithms S = new Sorting_Algorithms();
        //S.BubbleSort(arr);
        //System.out.println(Arrays.toString(arr));
        //S.SelectionSort(arr2);
        // S.InsertionSort(arr2);
        S.QuickSort(arr2,0, arr2.length);
        System.out.println(Arrays.toString(arr2));

         /* S.Selection_Sort(arr);
         S.Bubble_sort(arr);
         S.Insertion_sort(arr);
        S.QuickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));*/

    }
}
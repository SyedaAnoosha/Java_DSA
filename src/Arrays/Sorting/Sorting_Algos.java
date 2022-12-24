package Arrays.Sorting;

import java.util.Arrays;

public class Sorting_Algos {
    public void Selection_Sort(int[] arr){

        //In every iteration the minimum number and if there exists any we replace it with the

        int min,temp;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            min=i;
            for (int j = i+1; j < n ; j++) {
                if(arr[j]<arr[min])
                    min=j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));


    }

    public void Bubble_sort(int[] arr){

    }
}

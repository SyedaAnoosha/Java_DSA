package Arrays.Sorting;

import javax.swing.*;
import java.security.cert.PolicyQualifierInfo;
import java.util.Arrays;

public class Sorting_Algorithms {
    public void Selection_Sort(int[] arr){
        //In every iteration of j the minimum number is decided and if there exists any we replace it with the ith element
        //i -> for looping
        //j -> for min
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

    //ith largest element is bubbled up at the right end in every ith iteration
    //i -> for rounds
    //j -> for comparing
    public void Bubble_sort(int[] arr){
        int temp;
        for (int i = 0 ; i < arr.length - 1 ; i++) { // i=1 to i<n or i=0 to i<=n-1
            for (int j = 0 ; j < arr.length-1-i ; j++) { // j=0 to j=n-i
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //no swapping instead shifting
    public void Insertion_sort(int[] arr){
        System.out.println(Arrays.toString(arr)+"\n");

        for (int i = 1; i < arr.length ; i++) {
            int temp=arr[i];
            int j=i-1;
            while( j>=0 && arr[j]>temp ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // QuickSort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot.
    // There are many versions of quickSort that pick pivot in different ways.
    //first element as a pivot.
    //last element as a pivot
    //Pick a random element as a pivot.
    //Pick median as the pivot.

    void swap(int[] A, int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }
    int partition(int[] A, int low, int high){
        //selection of pivot element
        int pivot=A[low];

        //right place of pivot element
        int count = 0;
        for (int i = low + 1; i < high ; i++) {
            if(A[i]<pivot){
                count++;
            }
        }
        //right index of pivot element -> pivIndex
        int pivIndex = count + low;
        swap(A,pivIndex,count);
        int s = low, e = high;

        // for partitioning (  <pivot | pivot | >pivot  )
        while(s<pivIndex && e>pivIndex){
            if(A[s]<=pivot){  //checking for elements lesser than pivot
                s++;
            }

            if(A[e]>=pivot){ //checking for elements greater than pivot
                e--;
            }

            if(s<pivIndex && e>pivIndex){
                swap(A,A[s++],A[e--]);
            }

        }

        return pivIndex;
    }
    public void QuickSort1D(int[] A, int low, int high){

        //low is 0
        //high is A.length-1

        // base case
        // l<h or l>=h { return; }

        if(low<high){

            //partitioning an array
           int pivot_index = partition(A,low,high);

           // left part sorting from lower index to the index one lesser than pivot index
           QuickSort1D(A,low,pivot_index-1);

           //right part sorting from index one greater than pivot index to the higher index
           QuickSort1D(A,pivot_index+1,high);
        }


        System.out.println(Arrays.toString(A));
    }
}

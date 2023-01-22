package Array.Sorting;

public class Sorting_Algorithms {

    public void BubbleSort(int[] a){
        int temp;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public void SelectionSort( int[]a){
        int min,temp;
        for (int i = 0; i < a.length-1 ; i++) {
            min=i;
            for (int j = i+1; j < a.length ; j++) {
                if(a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[min];
            a[min] = a[i];
            a[i]=temp;
        }
    }

    public void InsertionSort(int[] a){
        int temp;
        for (int i = 1; i < a.length ; i++) {
            temp=a[i];
            int j = i-1;
            while( j >=0 && a[j]>temp){
                a[j+1]= a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }

    public void QuickSort(int[] a, int p, int q){
        if(p<q){
            int m = partition(a,p,q);
            QuickSort(a,p,m-1);
            QuickSort(a,m+1,q);
        }
    }

    private int partition(int[] a, int p, int q) {
        int piv = a[p], i=p, j=q;
        while(i<j){
            while(i<j && a[--j] >= piv);
            if(j>i){
                a[i]=a[j];
            }
            while(i<j && a[++i] <= piv);
            if(j>i){
                a[j]=a[i];
            }
        }
        a[j]=piv;
        return j;
    }

}














































/*

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

    // ith largest element is bubbled up at the right end in every ith iteration
    // i -> for rounds
    // j -> for comparing
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

    // QuickSort is a Divide and Conquer algorithm.

   */
/* int partition(int[] A, int low, int high){

        //selection of pivot element
        int pivot=A[low];

        //right place of pivot element
        int count = 0;

        // for checking how many elements are lesser than pivot element
        for (int i = low + 1; i <= high ; i++) {
            if(A[i]<=pivot){
                count++;
            }
        }

        //right index of pivot element -> pivIndex
        int pivIndex = count + low;
        int temp = A[pivIndex];
        A[pivIndex] = A[low];
        A[low] = temp;

        int s = low, e  = high;

        // for partitioning (  <pivot | pivot | >pivot  )
        while(s < pivIndex && e > pivIndex){
            if(A[s]<=pivot){  //checking for elements lesser than pivot
                s++;
            }

            if(A[e]>=pivot){ //checking for elements greater than pivot
                e--;
            }

            if(s < pivIndex && e > pivIndex){
                int loc = A[s];
                A[s] = A[e];
                A[e] = loc;
            }
        }

        return pivIndex;
    }*//*



    private int partition(int[] a, int p, int q) {
        int pivot = a[p], i = p, j = q; // steps 1-2
        while (i < j) { // step 3
            while (i < j && a[--j] >= pivot) ; // step 4
            if (i < j) {
                a[i] = a[j]; // step 5
            }
            while (i < j && a[++i] <= pivot) ; // step 6
            if (i < j) {
                a[j] = a[i]; // step 7
            }
        }
        a[j] = pivot; // step 8
        return j;
    }


    public void QuickSort(int[] a, int p, int q) {

       if (p<q) {
           int m = partition(a, p, q); // step 2
           QuickSort(a, p, m); // step 4
           QuickSort(a, m+1, q); // step 5
       }

       return;

    }



    */
/*public void QuickSort1D(int[] A, int low, int high){

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

    }*//*

}
*/

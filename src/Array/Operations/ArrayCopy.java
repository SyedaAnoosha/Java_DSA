package Array.Operations;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,0};
        System.arraycopy(arr1,0,arr2,0,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

        int[] arr3={1,2,3,4,5};
        int[] arr4 = new int[arr3.length];

        for (int i = 0; i < arr4.length; i++) {
            arr4[i]=arr3[i];
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }


        int a[] = { 2, 8, 3 };

        int b[] = new int[a.length];
        b = a;

        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println("\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }

}

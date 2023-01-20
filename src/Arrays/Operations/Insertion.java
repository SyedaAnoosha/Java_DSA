package Arrays.Operations;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = new int[6];

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;

        //printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();


        //for insertion of element at beginning we need to create a space

        for (int i = 3; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[0]=10;

        //printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();


        //for insertion of element at any index we need to create a space

        int j = 2;  // index at which element will be inserted
        for (int i = 4; i >= j ; i--) {
            arr[i+1] = arr[i];
        }

        arr[2] = 20;

        //printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();


    }
}

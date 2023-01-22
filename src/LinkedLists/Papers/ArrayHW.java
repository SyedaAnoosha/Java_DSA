package LinkedLists.Papers;

import java.util.Scanner;

public class ArrayHW {
    public static void main(String[] args) {

        int[][] arr = new int[10][3];
        int[] newArr = new int[30];
        Scanner sc = new Scanner(System.in);

        //storing an array
        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=i;
            arr[i][1]=(i+1);
            arr[i][2]=(i+2);

        }
        //printing an array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        //2D -> 1D
        int k;
        for (int i = 0; i < 10; i++) {
           newArr[i]=arr[i][0];
           newArr[i+10]=arr[i][1];
           newArr[i+20]=arr[i][2];
        }
        System.out.println();
        //printing array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] +" ");

        }
    }
}

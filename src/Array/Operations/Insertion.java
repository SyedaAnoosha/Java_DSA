package Array.Operations;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        //Insertion at last:
        int[] a = {1,2,3,4,5,6};
        int[] b = new int[a.length+1];

        System.out.println(Arrays.toString(a));

        System.out.println("Enter element wants to be inserted at last: ");

        int n = sc.nextInt();

        b[b.length-1]=n;
        System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(b));




        //Insertion at first:
        int[] a1 = {1,2,3,4,5,6};
        int[] b1 = new int[a1.length+1];

        System.out.println(Arrays.toString(a1));

        System.out.println("Enter element wants to be inserted at last: ");
        int n1 = sc.nextInt();

        b1[0]=n1;
        System.arraycopy(a1,0,b1,1,a1.length);
        System.out.println(Arrays.toString(b1));




        //insertion at any position
        int[] a2 = {1,2,3,4,5,6};
        int[] b2 = new int[a2.length+1];

        System.out.println(Arrays.toString(a2));

        System.out.println("At which position you want to insert it ");
        int index = sc.nextInt();
        System.out.println("Enter element you want to be inserted: ");
        int n3 = sc.nextInt();

        for(int i=0; i<a2.length+1; i++){
            if(i<index) {
                b2[i] = a2[i];
            }
            else if(i==index){
                b2[i] = n3;
            }
            else
                b2[i]=a2[i-1];
        }
        System.out.println(Arrays.toString(b2));


    }
}

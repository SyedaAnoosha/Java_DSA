package Arrays.Searching;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1D ={10,6,8,3,2,7};
        int[][] arr2D = {{4,2,3},{9,0,6},{5,8,1}};
        int[] arrSorted1D={2,5,7,8,9,10};
        int[][] arrSorted2D =  {{1,2,3},{4,5,6},{7,8,9}};
        int key1=8;
        int key2=5;

        Searching_Algorithms S = new Searching_Algorithms();

        int index1= S.LinearSearch1D(arr1D,key1);
        int[] indexL = S.LinearSearch2D(arr2D,key2);
        int index2= S.BinarySearch1D(arrSorted1D,key1);
        int[] indexB = S.BinarySearch2D(arrSorted2D,key2);

        if(index1==-1){
            System.out.println("Key: \""+key1+"\" not found");
        }
        else{
            System.out.println("Key: \""+key1+"\" found at index: "+index1);
        }

        if(Arrays.equals(indexL, new int[]{-1, -1})){
            System.out.println("Key: \""+key2+"\" not found");
        }
        else{
            System.out.println("Key: \""+key2+"\"  found at index: ["+indexL[0]+","+indexL[1]+"]");
        }

        if(index2==-1){
            System.out.println("Key: \""+key1+"\" not found");
        }
        else{
            System.out.println("Key: \""+key1+"\" found at index: "+index2);
        }

        if(Arrays.equals(indexB, new int[]{-1, -1})){
            System.out.println("Key: \""+key2+"\" not found");
        }
        else{
            System.out.println("Key: \""+key2+"\"  found at index: ["+indexB[0]+","+indexB[1]+"]");
        }
    }
}

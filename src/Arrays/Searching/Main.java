package Arrays.Searching;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1D ={10,6,8,3,2,7};
        int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9}};
        int key1=0;
        int key2=10;

        Searching_Algos S = new Searching_Algos();

        int index1= S.LinearSearch1D(arr1D,key1);
        int[] index = S.LinearSearch2D(arr2D,key2);

        if(index1==-1){
            System.out.println("Key: \""+key1+"\" not found");
        }
        else{
            System.out.println("Key: \""+key1+"\" found at index: "+index1);
        }

        if(Arrays.equals(index, new int[]{-1, -1})){
            System.out.println("Key: \""+key2+"\" not found");
        }
        else{
            System.out.println("Key: \""+key2+"\"  found at index: ["+index[0]+","+index[1]+"]");
        }
    }
}

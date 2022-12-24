package Arrays.Searching;

public class Searching_Algos{
    public int LinearSearch1D(int[] A, int key){
        for (int i = 0; i < A.length; i++) {
            if(key==A[i]){
                return i;
            }
        }
        return -1;
    }
    public int[] LinearSearch2D(int[][] A, int key){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (key == A[i][j]) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public void BinarySearch1D(int[] A, int key, int first, int last){
        int mid = (first + last)/2;
        while( first <= last ){
            if (A[mid] == key ){
                System.out.println(key+" is found at index: " + mid);
                break;
            }
            if ( A[mid] < key ){
                first = mid + 1;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println(key+" is not found!");
        }
    }
    public void BinarySearch2D(int[][] B,int key){
        int row = 0;
        int col = B[row].length - 1;
        while (row < B.length && col >= 0) {
            if (B[row][col] == key) {
                System.out.println(key+ " found at: "+row +":"+ col);
            }
            if (B[row][col] < key) {
                row++;
            }
            else {
                col--;
            }
        }

    }
}
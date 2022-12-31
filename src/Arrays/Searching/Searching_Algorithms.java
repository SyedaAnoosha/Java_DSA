package Arrays.Searching;

public class Searching_Algorithms {
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
    public int BinarySearch1D(int[] A, int key){
        int first = 0;
        int last = A.length-1;
        int mid = first + (last - first)/2;
        while( first <= last ){

            if (A[mid] == key ){
                return mid;
            } else if ( A[mid] < key ){
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return -1;
    }
    public int[] BinarySearch2D(int[][] B,int key){
        int row = 0;
        int col = B[row].length - 1;
        while (row < B.length && col >= 0) {
            if (B[row][col] == key) {
                return new int[]{row, col};
            }
            if (B[row][col] < key) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
package Recursion;

/*
 Solution: if(1 disc)
 Simply move that disc from A to C

 Solution:   (if more than one disc)
 Step 1:   Move n-1 discs from A to B
 Step 2:   Move a disc from A to C
 Step 3:   Move n-1 discs from B to C
 */

public class towerOfHanoi {
    public static void TowerOfHanoi(int n , String source , String helper , String destination){
        if (n == 1){
            System.out.println("transfer disc "+n+" from "+source+" to "+destination);
            return;
        }
        TowerOfHanoi(n-1 , source , destination , helper);
        System.out.println("transfer disc "+n+" from "+source+" to "+destination);
        TowerOfHanoi(n-1 , helper , source , destination);
    }
    public static void main(String[] args) {

        int numOfTowers;
        if (args.length>0){
            numOfTowers = Integer.parseInt(args[0]);
            TowerOfHanoi(numOfTowers, "A", "B", "C");
        }

    }
}
package Recursion;

public class Fibonacci {

    //recursive approach
    public static long fab(int n){
        if (n == 0) return 0; // base condition
        if (n == 1) return 1; // base condition
        return (fab(n-1) + fab(n-2));
    }
    public static void main(String[] args) {

        for (int i=5; i<=15; i++){
            long time1 = System.currentTimeMillis();
            long n = fab(i);
            long time2 = System.currentTimeMillis();
            System.out.println("Fibonacci " + i + " = " + n + " and time is " + (time2 - time1) + " milliseconds");
        }

        for (int i=45; i<=50; i++){
            long time1 = System.currentTimeMillis();
            long n = fab(i);
            long time2 = System.currentTimeMillis();
            System.out.println("Fibonacci " + i + " = " + n + " and time is " + (time2 - time1) + " milliseconds" );
        }
    }
}

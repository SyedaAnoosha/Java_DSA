package Recursion;

public class Factorial {

    public static long fac(int n){
        if(n == 0 || n == 1) { //base condition: no further recursive calls needed.
            return 1;
        }
        return n * fac(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fac(4));
        long time1 = System.currentTimeMillis();
        for (int i = 125; i <=135 ; i++) {
            System.out.println("Factorial of " + i + " = " + fac(i));
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Time is " + (time2 - time1)+ " milliseconds");
    }

//    public static BigInteger fac(int n){
//        if(n == 0 || n == 1) { //base condition: no further recursive calls needed.
//            return BigInteger.ONE;
//        }
//        return BigInteger.valueOf(n).multiply(fac(n-1)) ;
//    }
}

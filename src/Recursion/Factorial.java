package Recursion;

import java.util.Scanner;

public class Factorial {

    //recursive approach
    public static long fac(int n){
        if(n <= 0 || n == 1) {
            return 1;
        }
        return n * fac(n-1);
    }

    //loop approach
    public static int f(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        long ans = fac(n);
        System.out.println("Factorial of " + n + " = " + ans);
    }
}

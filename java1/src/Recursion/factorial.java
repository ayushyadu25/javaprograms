package Recursion;

import java.util.Scanner;


public class factorial {
    public static double fact(double n ){
        if(n==1 || n==0) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        double n = sc.nextDouble();
        System.out.print(fact(n));
    }
}

package Recursion;

import java.util.Scanner;

public class sumreturntype {
    public static double sum(double n ){
        if(n==1 || n==0) return 1;
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        double n = sc.nextDouble();
        System.out.print(sum(n));
    }
}

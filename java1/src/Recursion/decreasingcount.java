package Recursion;

import java.util.Scanner;

public class decreasingcount {
    public static void print(int n){
        if(n==0) return;

        print(n-1);              // just interchanging these two line will
        System.out.println(n);   // increasing or decreasing count
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        print(n);

    }
}

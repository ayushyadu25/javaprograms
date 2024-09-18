package patternprinting.java;

import java.util.Scanner;

public class reversepattern {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    for (int i=1;i<=a;i++) {
        for (int j = 1; j <= a+1- i; j++) {
            System.out.print((char)(j+64)+" ");
        }
        System.out.println();
    }}
}

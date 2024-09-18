package basicsofjava.java;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.print("Enter the number: " );
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.print("Enter the number to check divisibility with: ");
        double a = sc.nextDouble();
        if((num%a) == 0) System.out.print(num + " is divisible by " + a);
        else System.out.print(num + " is not divisible  by "+ a);
    }
}

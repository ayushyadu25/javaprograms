package basicsofjava.java;

import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        if (9999<a && a<100000) System.out.println("The given number is 5 digit number");
        else System.out.println("The given number is not a 5 digit number");
        // for && all conditions must be true to execute the program
        System.out.print("enter the number for checking divisibility by 3 or 5: ");
        double b = sc.nextDouble();
        if (b%3 == 0 || b%5 == 0) System.out.print("Divisible by 3 or 5");
        else System.out.println("Not divisible by 3 or 5");
        // for || one of the conditions must be true to execute the program
    }
}

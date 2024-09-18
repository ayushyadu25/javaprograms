package basicsofjava.java;

import java.util.Scanner;

public class ternirary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.println((a%2==0)? "even":"odd");
    }
}

package basicsofjava.java;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int a = sc.nextInt();
        switch(a){
            case '1':
                System.out.println(a);
            case '2':
                System.out.println(a);
            case '3':
                System.out.println(a);
            default:
                System.out.println("hello");

        }

    }
}

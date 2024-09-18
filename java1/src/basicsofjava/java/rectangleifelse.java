package basicsofjava.java;

import java.util.Scanner;

public class rectangleifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int a = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();
        System.out.println("area is: "+a*b);
        System.out.println("perimeter is: "+a+b);
        if((a+b)<(a*b)) System.out.print("the area is greater than perimeter");
        if((a+b)>(a*b)) System.out.print("the area is lesser than perimeter");

    }
}

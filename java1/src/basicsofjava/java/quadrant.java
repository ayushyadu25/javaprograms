package basicsofjava.java;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinates: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinates: ");
        int y = sc.nextInt();
        if (x>0){
            if (y>0) System.out.println("1st quad");
            else if (y==0) System.out.println("on x-axis");
            else System.out.println("4th quad");
        }
        else if (x<0){
            if (y>0) System.out.println("2nd quad");
            else if (y==0) System.out.println("on x-axis");
            else System.out.println("3rd quad");
        }
        else{
            if (y>0) System.out.println("on y-axis");
            else if (y==0) System.out.println("origin");
            else System.out.println("on y-axis");
        }

    }
}

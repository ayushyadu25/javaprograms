package basicsofjava.java;

import java.util.Scanner;

public class proftiorloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();
        if(sp>cp) System.out.print("profit of : " + (sp-cp));
        if(cp>sp) System.out.print("loss of : " + (cp-sp));
        else System.out.print("Neither profit nor loss");
    }
}

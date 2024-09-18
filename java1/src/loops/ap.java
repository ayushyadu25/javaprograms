package loops;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of terms of ap ");
        int n = sc.nextInt();
        System.out.print("enter the  common difference ");
        int d = sc.nextInt();
        for (int i=1;i<=(2+((n-1)*d));i+=d){
            System.out.println(i);
        }

    }
}

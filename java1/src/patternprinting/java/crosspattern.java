package patternprinting.java;

import java.util.Scanner;

public class crosspattern { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int mid = (n+1)/2;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            if ((i+j)%2==0)
                System.out.print("0"+ " ");
            else System.out.print("1"+" ");
        }
        System.out.println();
    }


}}

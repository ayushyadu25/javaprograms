package patternprinting.java;

import java.util.Scanner;

public class mixpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i=1;i<=a;i++) {
            if (i%2==0){
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64)+" ");
            }}
            if(i%2!=0){
                for (int j = 1; j <= i; j++) System.out.print(j+ " ");
        }System.out.println();
        }

}}

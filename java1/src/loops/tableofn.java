package loops;

import java.util.Scanner;

public class tableofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 10;
        for (int i=1;i<=a;i++){
            System.out.println(n + " * " + i+" = "+(n*i));
        }
    }
}

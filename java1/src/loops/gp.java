package loops;

import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        int r = sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a = a * r;
        }
    }
}

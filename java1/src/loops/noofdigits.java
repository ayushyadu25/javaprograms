package loops;

import java.util.Scanner;

public class noofdigits {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int i=0;
    while(a!=0){
        a=a/10;
        i++;
    }
        System.out.println("number of digits is : "+i);


}}

package arrray;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you  want to search");
        int x = sc.nextInt();
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n;i++){

        arr[i] = sc.nextInt();
    }
    boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i]==x) {flag = true;
            break;
        }}
       if (flag == true) System.out.println("element exists");
       else System.out.println("element does not exist");

    }
}

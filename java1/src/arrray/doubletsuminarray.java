package arrray;

import java.util.Scanner;

public class doubletsuminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1;j<arr.length; j++) {
                if ((arr[i]+arr[j])==n){
                    System.out.print(arr[i]+","+arr[j]+"   ");
                    break;
                }
            }
        }
    }
}

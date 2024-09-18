package arrray;

import java.util.Scanner;

public class inputandoutputarray {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=6;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=1; i<=6;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

package arrray;

import java.util.Arrays;

public class builtInMethods {
    public static void main(String[] args) {
        int[] arr = {30,56,54,78,-12,10,23,5};
        // for each
        for (int x : arr){
            System.out.print(x+" ");
        }
        Arrays.sort(arr);
        System.out.println();

        for (int i = 0; i < arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

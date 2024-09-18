package arrray;

import java.util.Arrays;

public class arraycoping {
    public static void main(String[] args) {
        int[] arr = {30,10,20,40,50,56,87};
        for (int ele : arr){
            System.out.print(ele+" ");
        }

        // first method
        System.out.println();
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0]=70;
        System.out.println(arr[0]);


        // second method
        int[] crr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            crr[i]=arr[i];
        }
        crr[0]=100;
        System.out.println(arr[0]);
    }
}

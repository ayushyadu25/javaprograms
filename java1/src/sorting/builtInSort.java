package sorting;

import java.util.Arrays;

public class builtInSort {
    public static void main(String[] args) {
        int[] arr = {-2,-34,-34,34,56,45};
        for(int ele: arr){
            System.out.print(ele+" "  );

        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele: arr){
            System.out.print(ele+" "  );

        }
        System.out.println();
    }
}

package arrray;

//import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.ArrayList;
import java.util.Scanner;

public class rotatearray1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n-k; i < n; i++) {
           list.add(arr[i]);
        }
        for (int i = 0; i < n-k; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
}}

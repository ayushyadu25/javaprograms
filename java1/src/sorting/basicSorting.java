package sorting;

public class basicSorting {
    public static void main(String[] args) {
        int[] arr = {1,34,45,4555,46};
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag == false) System.out.println("Unsorted");
        else System.out.println("sorted");
    }
}

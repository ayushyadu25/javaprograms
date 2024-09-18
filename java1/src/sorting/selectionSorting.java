package sorting;

public class selectionSorting {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.println(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        print(arr);
        // Selection Sort
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx =-1;
            for (int j = 0; j < n; j++) {
                if(arr[j]<min){
                    min = arr[i];
                    mindx = j;
                }
            }
            swap(arr,i,mindx);
        }
        print(arr);
    }
}
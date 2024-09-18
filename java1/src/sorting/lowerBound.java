package sorting;

public class lowerBound {
    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void sort(int[] arr) {

        int n = arr.length;

        // Insertion Sort
        for (int i = 0; i < n; i++) {

            for (int j = i; j>=1; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr= {30,235,34,46,34,23,344};
        int  n = arr.length;
        sort(arr);
        print(arr);
        int target = 50;
        int  lb =n;
        int lo =0, hi = n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb=Math.min(lb,mid);
                hi = mid -1;
            }
            else lo = mid +1;
        }
        System.out.println(lb);
    }
}

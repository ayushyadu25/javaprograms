package sorting;

public class upperBound {
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
        int target = 46;
        int  ub =n;
        int uo =0, hi = n-1;
        while(uo<=hi){
            int mid = uo+(hi-uo)/2;
            if(arr[mid]>target){
                ub=Math.min(ub,mid);
                hi = mid -1;
            }
            else uo = mid +1;
        }
        System.out.println(ub);
    }
}

package arrray;

public class sumofarray {
    public static void main(String[] args) {
        int[] arr = {54,65,6,5,23,456,45,8};
        int sum =0;
        for (int i =1; i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}

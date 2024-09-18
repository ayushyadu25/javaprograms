package arrray;

public class maxofarray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,4,5,355545,5,3,255,5};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
//        -2147483648 is the value of mx assigned by MIN_VALUE that can be stored by int
        for (int i = 0;i<=n-1;i++){
            if (arr[i]>mx){
                mx = Math.max(mx,arr[i]);
            }

        } System.out.println(mx);
    }

}

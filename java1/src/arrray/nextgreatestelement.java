package arrray;

public class nextgreatestelement {
    public static void main(String[] args) {
        int [] arr = {34,356,4545446,57,45,45,46,4575,45};
        int n = arr.length;
        int[] and = new int[n];
        and[n-1] = -1;
//      method 1 not efficient
//        for (int i = 0; i < n-1; i++) {
//            int mx = Integer.MIN_VALUE;
//            for (int j = i+1; j < n; j++) {
//                mx = Math.max(mx, arr[j]);
//
//            }
//            and[i] = mx;
//        }

        // method 2
        int nge = arr[n-1];
        for (int i=n-2; i>=0; i--) {
            and[i] = nge;
            nge = Math.max(nge,arr[i]);
        }

        for(int ele : arr){
            System.out.print(ele+" ");

        }
        System.out.println();
        for (int ele: and){
            System.out.print(ele+" ");
        }
    }
}

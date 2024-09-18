package arrray;

public class secondmaxinarray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,4,5,355545,5,3,255,5};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0;i<=n-1;i++){
            if (arr[i]>mx){
                mx = Math.max(mx,arr[i]);
            }
            }System.out.println(mx);
        int smx = Integer.MIN_VALUE;
        for (int j = 0; j<n;j++){
                if (arr[j]!=mx){
                    smx = Math.max(smx,arr[j]);
                }
        }System.out.println(smx);

    }
}

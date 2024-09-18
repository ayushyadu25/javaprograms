package arrray;

public class maximuminarray {
    public static void main(String[] args) {
    int[] arr = {2,4,5,4,5,3,5,3,255,5};
    int n = arr.length;
    int a =arr[0];
    for (int i = 0;i<=n-1;i++){
        if (arr[i]>a){
            a = arr[i];
        }

    } System.out.println(a);
}
}

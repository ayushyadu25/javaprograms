public class sumof2darray {
    public static void main(String[] args) {
        



        int[][] arr = {{1,5,5456},{3,45,45},{34,65,45}};
        int sum=0;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               sum = sum+ arr[i][j];
            }
            
        }
        System.out.println(sum);
    }

    }


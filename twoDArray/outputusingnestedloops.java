import java.util.Scanner;
public class outputusingnestedloops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[3][4];
        int m =arr.length;
        int n = arr[0].length;
        System.out.println(m);
        // input of 2d array
        for(int i=0;i<3;i++){//rows
            for(int j=0;j<3;j++){//cols
                arr[i][j]=sc.nextInt();
            }
        }

        // output of 2d array
        for(int i=0;i<3;i++){//rows
            for(int j=0;j<3;j++){//cols
               System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}

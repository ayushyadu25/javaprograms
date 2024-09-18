package arrray;

public class mergetwosortedarray {
    public static void main(String[] args) {
        int[] a = {11,234,45,646};
        int [] b= {233,345,345,466,575};
        int[] c = new int[a.length+b.length];
        int i =0, j=0,k=0;
        //merging
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
        else {
            c[k]=b[j];
            j++;

            }
        k++;

        }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k]=a[i];
                i++;k++;
            }
        }
    for(int ele:c) {
        System.out.print(ele+" ");
    }
    }


}

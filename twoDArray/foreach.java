public class foreach {
    public static void main(String[] args) {
        
    
    int[][] b={{1,2,3},{4,5,6}};
    for(int[] ele : b){
        for(int x:ele){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
}}

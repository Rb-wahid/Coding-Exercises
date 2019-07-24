import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        Scanner myScanner  = new Scanner(System.in);
        int t = myScanner.nextInt();
        int[][] arr = new int[t][2];
        
        for(int p = 0; p < t; p++){
           for(int q = 0; q < 2; q++){
               arr[p][q] = myScanner.nextInt();
           } 
        }
          for(int p = 0; p < t; p++){
           for(int q = 1; q > 0; q--){
               if(arr[p][q] % arr[p][q-1] == 0) System.out.println("Yes");
               else System.out.println("No");
           } 
        }
    }
}

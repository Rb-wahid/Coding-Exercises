import java.util.*;

class TestClass {
    
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        
        for(int p = 2; p < num; p++){
        if(num % p == 0) return false;
        }
        
        return true;
    } 
    
    public static void printPrime(int num){
        for(int p = 2; p < num ; p++){
            if(isPrime(p) ) System.out.print(p +" ");
        }
    }
    public static void main(String args[] ) throws Exception {

              Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();                 // Reading input from STDIN
 
        printPrime(num);
    }
}

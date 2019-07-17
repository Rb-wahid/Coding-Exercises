package $1_FirstTimeToSolve;

import java.util.Scanner;

public class $1_Omar {
    public static void main (String[] args ){

        Scanner myScanner = new Scanner(System.in);
        int T = myScanner.nextInt(); // the number of test cases
        int[][] arr = new int[T][2];
        int[] result = new int[T];
        for(int p = 0; p < T; p++){
            for(int q = 0; q < 2; q++) {

                arr[p][q] = myScanner.nextInt();
               // System.out.print(" ");
            }
        }
        for(int p = 0; p < T; p++){
            for(int q = 1; q < 2; q++) {

                result[p] = arr[p][q-1] + arr[p][q];
            }
        }

        for (int r = 0; r < T ; r++){
            System.out.println(result[r]);
        }

    }
}

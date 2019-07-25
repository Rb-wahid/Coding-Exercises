//Approach 1: Brute Force (LeetCode solution practice)
import java.util.Arrays;

public class $1_Two_Sum_$BruteForce {

    public  static int[] twoSum(int[] num , int target){
        for(int p = 0; p < num.length; p++){
            for (int q = p + 1; q < num.length; q++){
                if(target == num[p] + num[q]){
                    return new int[] {p, q};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args){
        int[] num = {5,3,6,7};

        System.out.println(Arrays.toString(twoSum(num, 9)));

    }

}

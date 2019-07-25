//Approach 3: One-pass Hash Table (LeetCode solution practice)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $3_Two_Sum_$OnePassHashTable {

    public static int[] twoSum(int[] num, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int p = 0; p < num.length; p++){
            map.put(num[p], p);
            int complement = target - num[p];
            if(map.containsKey(complement) && map.get(complement) != p){
                return new int[] {p, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args){
        int[] num = {8,4,2,6,8};

        System.out.println(Arrays.toString(twoSum(num, 12)));
    }
}

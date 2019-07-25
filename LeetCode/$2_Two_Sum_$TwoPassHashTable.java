//Approach 2: Two-pass Hash Table (LeetCode solution practice)
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $2_Two_Sum_$TwoPassHashTable  {

        public static int[] twoSum(int[] nums, int target){

         Map<Integer, Integer> map = new HashMap<>();
        for (int p = 0; p < nums.length; p++){
            map.put(nums[p], p);
        }
        for (int q = 0; q < nums.length; q ++){
            int complement = target - nums[q];
            if(map.containsKey(complement) && map.get(complement) != q){
                return new int[] {q, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args){

        int[] num = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(num,9)));
    }
}

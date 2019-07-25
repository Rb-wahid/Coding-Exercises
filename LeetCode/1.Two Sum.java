//my own solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int p = 0; p < nums.length; p++){
            for(int q = p+1; q < nums.length; q++){
                if(nums[p] + nums[q] == target){
                    result[0] = p;
                    result[1] = q;
                    return result;
                }
            }
        }
        return null;
    }
}

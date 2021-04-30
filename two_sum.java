import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] n = {3,2,3,4};
        int t = 6;
        int[] r = twoSum(n, t);
        System.out.println(Arrays.toString(r));
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; i < nums.length; j++){
                if (j == nums.length){
                    break;
                }
                if(nums[i] + nums[j] == target) {
                    return new int[] {nums[i], nums[j]};
                }
            }
        }
        return null;
    }
}
package 两数之和_20260701;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int f=0;
        for(i=0;i<nums.length;i++){
            for(f=i+1;f<nums.length;f++){
                if(nums[i]+nums[f]==target){
                    return new int[]{i,f};
                }
            }
        }
        return new int[]{i,f};
    }

    public static void main(String[] args) {//测试方法
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        System.out.println(result[0] + ", " + result[1]);
    }
}

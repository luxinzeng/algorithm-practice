package 移动零;

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length ==0){
            return;//返回值为void
        }
        int index = 0;  // 记录下一个非零元素应该放的位置

        // 第一遍：把所有非零元素按顺序搬到前面
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {//用index来接受非空的数
                nums[index] = nums[i];
                index++;//通过index和i的同步+1，如果中途有0，也可保证数的连续
            }
        }

        // 第二遍：从 index 位置开始，后面全部填 0
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    static void main() {
        int[] nums = {0,1,0,3,12};
        Solution s = new Solution();
        s.moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

package 三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        //1.排序
        Arrays.sort(nums);
//        int left = 0;
//        int right = nums.length-1;
        List<List<Integer>> list = new ArrayList<>();


        for (int i = 0; i < nums.length-2; i++) {
            //去重
            if(i>0 && nums[i] == nums[i-1] ){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1 ;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> li = new ArrayList<>();//需要建立多个对象，因为不止一个
                    li.add(nums[i]);
                    li.add(nums[left]);
                    li.add(nums[right]);
                    list.add(li);//大的集合套上小的集合

                    while(left < right && nums[left] == nums[left+1]){
                        left++;//这两个while是判断sum==0时，指针前后有无相同数字，有则跳过
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;//因为满足了一个条件，要满足第二个，所以左右指针都需要改变
                }else if (sum < 0){
                     left++;
                }else{
                    right--;
                }
            }
        }
        return list;
//        while(left < right){
//            for (int i = 1; i < right; i++) {
//                if(nums[i] + nums[left] + nums[right] < 0){
//                    left++;
//                }else if(nums[i] + nums[left] + nums[right] > 0){
//                    right--;
//                }else{
//                    list.add(nums[i]);
//                    list.add(nums[left]);
//                    list.add(nums[right]);
//                }
//            }
//            return list;
//
//        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}

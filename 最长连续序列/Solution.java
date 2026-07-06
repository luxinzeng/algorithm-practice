package 最长连续序列;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {//装入set，第一个循环
            set.add(num);
        }

        for (int num : nums) {
            if(!set.contains(num-1)){//寻找起点，第二个循环
                int cur = num,len = 1;//cur代表暂时的起点
                while(set.contains(cur+1)){//寻找起点后的一位数，并判断是否在set中
                    cur++;//自增，第三个循环
                    len++;
                }
                max = Math.max(max,len);
            }
        }
        return max;
    }

    static void main() {
        int[] nums={100,4,200,1,3,2};
        Solution solution = new Solution();
        int max = solution.longestConsecutive(nums);
        System.out.println(max);
    }
}

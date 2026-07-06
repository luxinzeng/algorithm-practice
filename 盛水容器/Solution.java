package 盛水容器;

public class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int left = 0;
        int right = height.length-1;
        int maxWater = 0;

        while(left < right){//保证指针不越界
            int minHeight = Math.min(height[left],height[right]);//寻找最低高度
            int width = right - left;//找宽度
            int currenWater = width * minHeight;//临时水容器的容积

            maxWater = Math.max(maxWater,currenWater);//最大水容器的容积

            if(height[left]<height[right]){//指针移动
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }

    static void main() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution so = new Solution();
        int re = so.maxArea(height);
        System.out.println(re);
    }
}

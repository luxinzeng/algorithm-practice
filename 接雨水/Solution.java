package 接雨水;

public class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int left = 0;
        int leftMax = 0;
        int right = height.length-1;
        int rightMax = 0;
        int ans = 0;

        while (left < right){
            //水桶的高度有低边决定，所以要判断左右高度哪一个低
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];//注意不能将高度和索引搞混
                }else{//如果最大左边大于历史左边，就计算总容积
                    ans += leftMax - height[left];//注意这里是先加后等，也就是求总容积
                }
                left ++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    ans += rightMax - height[right];
                }
                right --;
            }
        }
        return ans;
    }

    static void main() {
        int[] height = {4,2,0,3,2,5};
        Solution so = new Solution();
        int trap = so.trap(height);
        System.out.println(trap);

    }
}

package 无重复子串;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        //非空判断
        if(s.length() == 0 || s == null){
            return 0;
        }

        HashSet<Character> set = new HashSet<>();//泛型不支持基本类型！
        int left = 0;//用来记录向右边滑动窗口的长度
        int maxLen = 0;//最大长度

        //拆分为字符,为数组
        char[] charArray = s.toCharArray();

        for (int right = 0; right < charArray.length; right++) {
             char c =  charArray[right];//找到一个中间变量
             //用 contains() 判断重复
            while(set.contains(c)){
                set.remove(charArray[left]);
                left++;
            }
            set.add(c);//使用set容器接收，判断
            maxLen = Math.max(maxLen,right - left + 1);//因为使用了remove方法，在判断的同时，也在删除，所以需要最大值来记录长度
        }
        return maxLen;

    }

    static void main() {
        String s = "abcabcb";
        Solution so = new Solution();
        int i = so.lengthOfLongestSubstring(s);
        System.out.println(i);

    }
}

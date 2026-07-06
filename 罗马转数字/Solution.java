package 罗马转数字;

import java.sql.SQLOutput;

class Solution {
    public int romanToInt(String s) {


        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        //建立字符和数字大小对应的数组，且从大到小进行排序

        int result = 0;
        int index =0;

        //将字符串反复和字符数组比较，同时result加或减对应的数字
        for (int i = 0; i < values.length; i++) {
            while (s.startsWith(symbols[i],index)){//运用了String中一个比较罕见的方法startsWith
                //比较字符和字符串索引位置，返回布尔
                result += values[i];
                index += symbols[i].length();

            }

        }

        return result;//将字符通过toString的方式合并
    }

    static void main() {
        String s1 = "III";
        Solution s = new Solution();
        int i = s.romanToInt(s1);
        System.out.println(i);
    }
}

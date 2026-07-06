package 数字转罗马;

class Solution {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        //建立字符和数字大小对应的数组，且从大到小进行排序
        StringBuilder results = new StringBuilder();

        //将参数循环减数组中最大的数，同时在StringBuilder中添加字符
        for (int i = 0; i < values.length; i++) {
            while(num >= values[i]){
                num -= values[i];
                results.append(symbols[i]);
            }
        }
        return results.toString();//将字符通过toString的方式合并
    }

    static void main() {
        int num = 3749;
        Solution s = new Solution();
        String s1 = s.intToRoman(num);
        System.out.println(s1);

    }
}

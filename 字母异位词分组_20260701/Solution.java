package 字母异位词分组_20260701;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();//非空判断
        }

        Map<String,List<String>> map = new HashMap();

        for(String str : strs){//循环遍历
            char[] ch = str.toCharArray();//拆分字符串
            Arrays.sort(ch);//字符串排序
            //合并字符串
            String key = new String(ch);
            //比较新的字符串是否相同，，不相同新建集合
            if(map.containsKey(key)){
                //相同合并集合
                map.get(key).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());

    }

    static void main() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

         Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(strs);//创建一个集合容器来接收

        for(List<String> group : result){
            System.out.println(group);
        }
    }
}

package A_leecode.demo17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TelNumberToString {
    public static void main(String[] args) {
        List<String> strings = new Solution().letterCombinations("2587");
        System.out.println("strings = " + strings);

    }
}
class Solution {
    HashMap<String,String> hp;
    Solution(){
        hp=new HashMap();
        hp.put("2","abc");
        hp.put("3","def");
        hp.put("4","ghi");
        hp.put("5","jkl");
        hp.put("6","mno");
        hp.put("7","pqrs");
        hp.put("8","tuv");
        hp.put("9","wxyz");
    }
    public List<String> letterCombinations(String digits) {

    return back(digits);

    }
    public List<String> back(String s) {
        if(s.length()==0){
            return new ArrayList<>();
        }

        if(s.length()==1){
            List<String> l=new ArrayList<>();
            for(char c:hp.get(s).toCharArray())
                l.add(c+"");
            return l;

        }
        else {
            //接收递归函数返回的值
            //表示为最后的字符串
            List<String> back = back(s.substring(1));
            for (int i = 0; i < back.size(); i++) {
                System.out.println(back.get(i));
            }
            System.out.println("s.charAt(0)= " + s.charAt(0));
            //创建一个新的list存储当前数字表示的字符
            //表示为最前的字母
            List<String> l=new ArrayList<>();
            char c1 = s.charAt(0);
            for(char c: hp.get(c1+"").toCharArray())
                l.add(c+"");

            List<String> result=new ArrayList<>();
            for (int i = 0; i < l.size(); i++) {
                for (int j = 0; j < back.size(); j++) {
                    result.add(l.get(i)+(back.get(j)));
                }
            }
            return result;
        }
    }
}
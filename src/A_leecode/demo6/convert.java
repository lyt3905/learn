package A_leecode.demo6;

import java.util.*;

public class convert {
    public static void main(String[] args) {
        System.out.println(new Solution().convert("123456",3));
    }
}
class Solution {
    public String convert(String s, int numRows) {
        //当字符串长度小于行数时,原字符串就是我们需要输出的字符串
        if(s.length()<=numRows)
            return s;
        //建立一个列表，其中准备存放转换后每一行应该存放的数值
        //使用stringbuilder存储，适合任务访问，速度快，但是线程不安全。
        List<StringBuilder> list=new ArrayList<>() ;
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        //定义一个变量i，作为行指针
        int i=0;
        //定义一个变量flag，作为标识，是否该翻转
        int flag=-1;
        for(char r:s.toCharArray()){
            if(numRows!=1){
                list.get(i).append(r);
                if(i==0 || i== numRows-1) flag=-flag;
                i+=flag;
            }else
                list.get(0).append(r);


            StringBuilder res=new StringBuilder();
            for (int j = 0; j < list.size(); j++) {
                res.append(list.get(j));
            }
            System.out.println("res = " + res);
        }
        StringBuilder res=new StringBuilder();
        for (int j = 0; j < list.size(); j++) {
            res.append(list.get(j));
        }

        return res.toString();
    }
}
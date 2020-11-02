package A_leecode.demo3;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TheLongestString {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));;
    }
}
/*输入: "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
             请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。*/
//暴力破解
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int Biggest=0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character,Integer> hp=new HashMap<>();
            int n=i;
            int temp=0;
            while (!hp.containsKey(s.charAt(n))){
                hp.put(s.charAt(n),n);
                n++;
                temp++;
                if(n==s.length())
                    break;
            }
            Biggest=Math.max(temp,Biggest);
            System.out.println("biggest="+Biggest);

        }
        return Biggest;
    }
}
//滑动窗口
/*输入: "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
             请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。*/
class Solution2 {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set=new HashSet<>();
       int rk=-1,longest=0;//设置滑动窗口的右指针rk和 最大长度longest
        for (int i = 0; i < s.length(); i++) {
            if(i!=0)
                set.remove(s.charAt(i-1));
            while(rk+1<s.length() &&!set.contains(s.charAt(rk+1))){
                set.add(s.charAt(rk+1));
                rk++;

            }
            longest=Math.max(longest,rk-i+1);
        }
        return longest;
    }
}
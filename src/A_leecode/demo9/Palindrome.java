package A_leecode.demo9;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(45678654));
    }
}
//不将数字转成数组 直接进行判断
class Solution {
    public boolean isPalindrome(int x) {
      //对于一个回文数来说，末尾不可能为0，
      // 负数也不可能为回文数，所以我们需要先排除这两种情况
        if(x<0 || (x%10==0&&x!=0))
            return false;
        //定义一个变量，用来存储转换一半数字的
        int revNum=0;
        //当转换的数字大于等于原来的数字时，说明转换已经过半,结束循环
        while(revNum<x) {
            revNum=revNum*10+x%10;
            x/=10;
        }
        return x==revNum || x==revNum/10;
    }
}
/*
class Solution {
    public boolean isPalindrome(int x) {
        //直接传递int类型的话是设置容量
        StringBuilder sb=new StringBuilder(x+"");
        for (int i = 0,rk=sb.length()-1; i < sb.length()-1; i++,rk--) {
            if(sb.charAt(i)==sb.charAt(rk)) {
                continue;
            }
            else return false;
        }
        return true;
    }
}*/

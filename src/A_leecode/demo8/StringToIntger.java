package A_leecode.demo8;


import java.security.interfaces.RSAKey;

public class StringToIntger {
    public static void main(String[] args) {
        System.out.println("new MyAtoi=" +new Solution3().myAtoi("+-12456465465465456"));
}
}

class Solution {
    public int myAtoi(String s) {
        s=s.replaceAll(" ","");
        System.out.println("S="+s);
        if(s.charAt(0)=='-'){
            return StringToIntger(s);
        }else if(s.charAt(0)>='0' && s.charAt(0)<='9'){
            return StringToIntger(s);
        }else {
            return 0;
        }

    }
    public int StringToIntger(String s){
        int n=0;
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(((s.charAt(i)>='0' && s.charAt(i)<='9') || s.charAt(i)=='-') ){
                sb.append(s.charAt(i));
            }else {
                break;
            }
        }
            try{
                System.out.println("Sb="+sb);
                n=Integer.parseInt(sb.toString());
            }catch (Exception e){
                if(sb.charAt(0)=='-')
                    return Integer.MIN_VALUE;
                else
                    return Integer.MAX_VALUE;
            }
            return n;

    }

}
//利用状态机的方法
class Solution2{
    int myAtoi(String str) {
        long res = 0;
        int state = 0 ; // state == 0 为初始状态 ，1 为正整数状态 ，2为负整数
        char[] chars = str.toCharArray();
        for(char i: chars)
        {
            System.out.println("i="+i);
            if(state == 0 && i == ' ')continue;
            else if(state == 0 && i == '+')state = 1;
            else if(state == 0 && i == '-')state = 2;
            else if(Character.isDigit(i))
            {
                if(state == 0)
                    state = 1;
                   int tmp = i - '0';
                res = res*10 + tmp;
                if(res > Integer.MAX_VALUE)
                    break;
            }
            else break;
        }
        if(state == 1 && res > Integer.MAX_VALUE)
            res = Integer.MAX_VALUE;
        else if(state == 2)
        {
            res = -res;
            if(res < Integer.MIN_VALUE)
                res = Integer.MIN_VALUE;
        }
        return (int)res;
    }
}
class Solution3{
    public int myAtoi(String s){
        int state=0;//定义状态机的初始状态，0表示初始结果，1为正整数，2位负整数
        long result=0;//存储转换的结果
        for(char i :s.toCharArray()){
            if(state==0 && i==' ')
                continue;
            else if(state==0 && i=='+')
                state=1;
            else if(state==0 && i=='-')
                state=2;
            else if(Character.isDigit(i)){
                if(state==0)  state=1;
                result=result*10+(i-'0');
                if(result>Integer.MAX_VALUE)
                    break;
            }else break;
        }
        if(state==1){
            if(result>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            return (int)result;
        }
        else {
            result=-result;
            if(result<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            else
                return (int)result;
        }

    }
}

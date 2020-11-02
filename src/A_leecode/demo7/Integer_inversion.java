package A_leecode.demo7;

import java.io.IOException;

public class Integer_inversion {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.reverse(-923456789));

    }
}
//
class Solution {
    public int reverse(int x) {
        StringBuilder sb=new StringBuilder(x+"");
            if(sb.charAt(0)=='-'){
                StringBuilder sb2=new StringBuilder();
                for (int j = 1; j <sb.length() ; j++) {
                    sb2.insert(0,sb.charAt(j));
                }
                sb2.insert(0,"-");
                int i=0;
                try{
                    i=Integer.parseInt(sb2.toString());

                }catch (Exception e){

                }
                finally {
                    return i;
                }

            }else {
                StringBuilder sb2=new StringBuilder();
                for (int j = 0; j <sb.length() ; j++) {
                    sb2.insert(0,sb.charAt(j));
                }
                int i=0;
                try{
                    i=Integer.parseInt(sb2.toString());

                }catch (Exception e){

                }
                finally {
                    return i;
                }

            }
    }
}
class Solution2 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}


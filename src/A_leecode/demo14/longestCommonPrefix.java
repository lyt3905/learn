package A_leecode.demo14;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] a={"cir","cwr"};


        System.out.println(new Solution().longestCommonPrefix(a));
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs[0].length()==0)
            return "";
        String s=strs[0];
        System.out.println("S1="+s);
        for(int i=0;i<strs.length-1;i++) {
            s=lcp(s,strs[i+1]);
            System.out.println("S="+s);
        }
        return s;
    }
    String lcp(String a,String b){
        int len=Math.min(a.length(),b.length());
        int index=0;
        for (int i = 0; i < len; i++) {
            if(a.charAt(i)==b.charAt(i))
                index++;
            else break;
        }
        return a.substring(0, index);
    }
}
/*class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs[0].length()==0)
            return "";

        int sam=0;
        for(int i=0;i<strs.length;i++){
            int p=0;
            for (int j = 0; j <strs.length-1 ; j++) {
                if(i>=strs[j].length() || i>=strs[j+1].length())
                    break;
                if(strs[j].charAt(i)==strs[j+1].charAt(i))
                    p++;
            }
            if(p==strs.length-1)
                sam++;
        }
        return strs[0].substring(0,sam);

    }
}*/

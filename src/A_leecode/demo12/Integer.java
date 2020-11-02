package A_leecode.demo12;

public class Integer {
    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(3));
    }

}
//贪心算法
class Solution {
    public String intToRoman(int num) {
        int[]    n={1000,900 ,500,400 ,100,90  ,50 ,40  ,10 ,9   ,5  ,4   ,1};
        String[] s={"M" ,"CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder Roman=new StringBuilder();
        int p=0;
        while (num!=0){
            if(num>=n[p])
            {
                num-=n[p];
                Roman.append(s[p]);
            }
            else
                p++;
            System.out.println(num+" "+Roman.toString());
        }
        return Roman.toString();
    }
}
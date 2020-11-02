package A_leecode.demo13;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(new Solution().RomanToInteger("MCMXCIV"));
    }
}
class Solution {
    public int RomanToInteger(String s)
    {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            Integer value=hm.get(s.charAt(i)+"");
            if (i<s.length()-1&& value < hm.get(s.charAt(i + 1)+""))
                value = -value;
            result += value;
        }
        return result;
    }
}
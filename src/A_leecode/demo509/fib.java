package A_leecode.demo509;

import java.util.HashMap;
import java.util.Map;

public class fib {
    public static void main(String[] args) {
        System.out.println("fib="+new Solution().fib(20));
    }
}
class Solution {
    public int fib(int N) {

        Map<Integer,Integer> map=new HashMap<>();
        return back(map,N);
    }
    public int back(Map<Integer,Integer> map,int N){
        if(N<=1)return N;
        if(N==2) return 1;

        if(map.get(N) != null)  return map.get(N);

        map.put(N,back(map,N-1)+back(map,N-2));
        System.out.println("map.toString() = " + map.toString());
        return map.get(N);
    }
}
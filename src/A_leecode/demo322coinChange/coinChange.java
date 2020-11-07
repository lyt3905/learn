package A_leecode.demo322coinChange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class coinChange {
    public static void main(String[] args) {

        int[] coins={2};
        System.out.println(new Solution().coinChange(coins,3));


    }
}

//自底想上  数组
class Solution {

    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        if(coins.length==0) return -1;
        if( amount==0)return 0;
        if( amount<0)return -1;

        for (int i = 0; i < amount+1; i++) {
            for(int coin:coins){
                if(i-coin<0) continue;
                dp[i]=Math.min(dp[i],1+dp[i-coin]);
            }
        }
        System.out.println("Arrays.toString(dp) = " + Arrays.toString(dp));
        if(dp[amount]==amount+1)
            return -1;
        else  return dp[amount];
    }
}
//带备忘录的  time:263
// 40  35847
/*class Solution {

    Map<Integer,Integer> map=new HashMap<>();
    public int coinChange(int[] coins, int amount) {

        if(map.containsKey(amount)) return map.get(amount);
        if(coins.length==0) return -1;

        if( amount==0)return 0;
        if( amount<0)return -1;
        int less=Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int subproblem=coinChange(coins,amount-coins[i]);
            if(subproblem==-1) continue;
            less=Math.min(less,1+subproblem);

        }
        if(less!=Integer.MAX_VALUE)
        map.put(amount,less);
        else map.put(amount,-1);
        System.out.println("map.toString() = " + map.toString());
        if(less==Integer.MAX_VALUE)
            return -1;
        else return map.get(amount);

    }
}*/
//递归法，耗时较长 time:92

/*class Solution1 {
    int i1=0;
    public int coinChange(int[] coins, int amount) {
        i1++;
        if(coins.length==0) return-1;

        if( amount==0)return 0;
        if( amount<0)return -1;
        int less=Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int subproblem=coinChange(coins,amount-coins[i]);
            if(subproblem==-1) continue;
            less=Math.min(less,1+subproblem);
        }
        System.out.println("i1 = " + i1);
        if(less==Integer.MAX_VALUE)
        return -1;
        else return less;
    }
}*/

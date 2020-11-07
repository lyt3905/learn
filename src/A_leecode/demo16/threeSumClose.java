package A_leecode.demo16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class threeSumClose {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-5,3,-4};
        System.out.println(new Solution().threeSumClosest(nums,-1));
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int close=Integer.MAX_VALUE;
        int res=0;
        for (int i = 0; i <nums.length-2 ; i++) {
            for (int j = i+1; j <nums.length-1 ; j++) {
                for (int m = j+1; m <nums.length ; m++) {
                    if(close>Math.abs(nums[i]+nums[j]+nums[m]-target)){
                        close=Math.abs(nums[i]+nums[j]+nums[m]-target);
                        System.out.println(nums[i]+","+nums[j]+","+nums[m]);
                        res=nums[i]+nums[j]+nums[m];
                    }
                }
            }
        }
        return res;
    }
}
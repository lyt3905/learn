package A_leecode.demo15;

import dataStructure.BubbleSort.BubbleSort;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Integer[] nums ={-1, 0, 1, 2, -1, -4};

        System.out.println(new Solution().threeSum(nums).toString());

    }
}
class Solution {
    public List<List<Integer>> threeSum(Integer[] nums) {
        List<List<Integer>> ll1=new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j <nums.length-1 ; j++) {
                {
                    int a=find(nums,j+1,0-nums[i]-nums[j]);
                    if(a!=-1){
                        List<Integer> ll2=new ArrayList<>();
                        ll2.add(nums[i]);
                        ll2.add(nums[j]);
                        ll2.add(nums[a]);
                        if(!ll1.containsAll(ll2))
                            ll1.add(ll2);
                    }

                }
            }
        }
        return ll1;
    }
    int find(Integer[] nums,int off,int want){
        for (int i = off; i <nums.length ; i++) {
            if (nums[i]==want)
                return i;
        }
        return -1;
    }
}
package A_leecode.demo18;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] nums= {1, 0, -1, 0, -2, 2};
        System.out.println("new Solution().fourSum(nums,0) = " + new Solution().fourSum(nums, 0));
    }
}
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<List<Integer>> lists=threeSum(nums,i+1,target-nums[i]);

            for (int j = 0; j < lists.size(); j++) {
                List<Integer> remove = lists.get(j);
                remove.add(nums[i]);
                res.add(remove);
            }
            while (i<n-1 && nums[i]==nums[i+1]) i++;
        }
        return  res;


    }
    public List<List<Integer>> threeSum(int[] nums, int start,int target) {

        int n=nums.length;

        List<List<Integer>> res=new ArrayList<>();

        for (int i = start; i < n; i++) {
            List<List<Integer>> lists=twoSum(nums,i+1,target-nums[i]);

            for (int j = 0; j < lists.size(); j++) {
                List<Integer> remove = lists.get(j);
                remove.add(nums[i]);
                res.add(remove);
            }
            while (i<n-1 && nums[i]==nums[i+1]) i++;
        }
        return  res;
    }

    private List<List<Integer>> twoSum(int[] nums,int start,int target) {

        List<List<Integer>> res=new ArrayList<>();

        int p1=start   ,p2=nums.length-1;
        int left;
        int right;

        while (p1<p2){
            left  =nums[p1];
            right =nums[p2];
            if(left+right <target) while(p1<p2 && left==nums[p1])p1++;
            else if(left+right >target) while(p1<p2 && right==nums[p2]) p2--;
            else {
                List<Integer> l1=new LinkedList<>();
                l1.add(left);
                l1.add(right);
                res.add(l1);

                while(p1<p2 && left==nums[p1])p1++;
                while(p1<p2 && right==nums[p2]) p2--;
            }
        }

        return res;
    }

}
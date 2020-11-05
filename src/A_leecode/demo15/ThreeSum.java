package A_leecode.demo15;

import dataStructure.BubbleSort.BubbleSort;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Integer[] nums ={-4, -1, -1, 0, 1, 2};
        //nums = [-4, -1, -1, 0, 1, 2]
        System.out.println(new Solution().threeSum(nums).toString());

    }
}
class Solution {
    public List<List<Integer>> threeSum(Integer[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        List<List<Integer>> res=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<List<Integer>> lists=twoSum(nums,i+1,0-nums[i]);
            System.out.println("i="+i+"   "+lists.toString());
            for (int j = 0; j < lists.size(); j++) {
                List<Integer> remove = lists.get(j);
                remove.add(nums[i]);
                res.add(remove);
            }
            while (i<n-1 && nums[i]==nums[i+1]) i++;
        }
        return  res;
    }

    private List<List<Integer>> twoSum(Integer[] nums,int start,int target) {

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
/*
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
}*/

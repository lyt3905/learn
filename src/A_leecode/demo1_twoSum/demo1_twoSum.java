package A_leecode.demo1_twoSum;

public class demo1_twoSum {
    public static void main(String[] args) {
        int[] nums={2,5,5,11};
        int[] jieguo=new Solution().twoSum(nums,10);
        System.out.println(jieguo[0]+"  "+jieguo[1]);
    }
}
//暴力穷举法
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i< nums.length-1; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] tem={i,j};
                    return tem;
                }
            }
        }
        return null;
    }
}
//利用
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i< nums.length-1; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] tem={i,j};
                    return tem;
                }
            }
        }
        return null;
    }
}
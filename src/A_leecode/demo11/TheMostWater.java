package A_leecode.demo11;

public class TheMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println("new Solution().maxArea(height) = " + new Solution().maxArea(height));
    }
}
//题目描述：给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
// 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
// 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/container-with-most-water
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

//解答思路：
// 对于一个容器，两侧的边的最小值为容器的高，边所在位置的差值为容器的底。
//当我们以0，height.length-1两个位置的数值 为容器边时，我们可以得到第一个容积。
//此时决定我们容器容积的是两个边中的最小值。当我们移动边的时候，我们的底的长度是固定减少的
//因此 我们移动短边的结果会导致 新的容积 变大or变小or不变
//而   我们移动长边的结果会导致 新的容积 变小or不变 没有变大的可能
//因此为了取得容积的最大值，我们需要 移动两个边中的最小值。




class Solution {
    public int maxArea(int[] height) {
        int max=0;//存储计算后的最大容量
        int rk=height.length-1;
        int lk=0;
        while (rk!=lk) {
            int temp=Math.min(height[lk],height[rk])*(rk-lk);
            max=Math.max(max,temp);
            if(height[lk]>height[rk])
                rk--;
            else
                lk++;
        }
        return max;
    }
}
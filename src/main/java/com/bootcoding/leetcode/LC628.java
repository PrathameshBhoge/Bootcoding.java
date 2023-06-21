package main.java.com.bootcoding.leetcode;
import java.util.Arrays;
public class LC628 {
    public int maximumProduct(int[] nums) {
                Arrays.sort(nums);
                int fMax=nums[nums.length-1];
                int sMax=nums[nums.length-2];
                int tMax=nums[nums.length-3];

                int case1=fMax*sMax*tMax;
                int case2=nums[0]*nums[1]*nums[nums.length-1];
                return Integer.max(case1, case2);
    }
}
